package springtest08;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

@Repository
public class OperatorDaoImpl implements OperatorDao {

	private BCryptPasswordEncoder passwordEncoder;
	private JdbcTemplate jdbc;
	
	@Autowired
	public OperatorDaoImpl(BCryptPasswordEncoder passwordEncoder, JdbcTemplate jdbc) {
		this.passwordEncoder = passwordEncoder;
		this.jdbc = jdbc;
	}

	@Override
	public List<Operator> finaAll() {
		String sql = "select * from operators_t";
		return jdbc.query(sql,new OperatorRowMapper());
	}

	@Override
	public Operator findOne(Integer id) {
		String sql = "select * from operators_t where O_id = ?";
		return jdbc.queryForObject(sql, new OperatorRowMapper(), id);
	}

	@Override
	public void create(String username, String password, String role) {

		String sql = "insert into operators_t" + 
				"  (o_id, o_username, o_password, o_role)" + 
				"  values" + 
				"  (operators_t_seq.nextval, ?, ?, ?)";
		String bcyPassword = passwordEncoder.encode(password);
		jdbc.update(sql,username,bcyPassword,role);

	}

	@Override
	public void updatePassword(Integer id, String newPassword) {
		String sql = "update operators_t op set op.o_password = ? where op.o_id = ?";
		String bcyPassword = passwordEncoder.encode(newPassword);
		jdbc.update(sql,bcyPassword,id);
	}

	@Override
	public void delete(Integer id) {
		String sql = "delete from operators_t op where op.o_id = ?";
		jdbc.update(sql,id);
	}

	@Override
	public void disable(Integer id) {
		String sql = "update operators_t op set op.o_disabled = '0' where op.o_id = ?";
		jdbc.update(sql,id);
	}

	@Override
	public void enable(Integer id) {
		String sql = "update operators_t op set op.o_disabled = '1' where op.o_id = ?";
		jdbc.update(sql,id);
	}

	
	public void printAll(List<Operator> list) {
		for(Operator op : list) {
			System.out.println(
					"\tID："+op.getId()+
					"\t姓名："+op.getUsername()+
					"\t职责："+op.getRole()+
					"\t权限状态："+op.getDisablead()+
					"\t密码："+op.getPassword()
			);
		}
	}
}
