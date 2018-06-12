package springtest07;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbc;
	
	
	public StudentDaoImpl(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	@Override
	public Student findone(Integer id) {
		String sql = "select * from student_t stu where stu.student_id = ?";
		return jdbc.queryForObject(sql,new StudentRowMapper(),id);
	}

	@Override
	public void add(Student student) {
		String sql = "insert into student_t" + 
				"  (student_id, student_name, student_gender, student_age, student_major)" + 
				"  values" + 
				"  (student_seq.nextval, ?, ?, ?, ?)";
		jdbc.update(sql, 
					student.getName(),
					String.valueOf(student.getGender()),
					student.getAge(),
					student.getMajor());
	}

	@Override
	public void delete(Integer id) {
		String sql = "delete from student_t stu where stu.student_id = ?";
		jdbc.update(sql,id);
	}

	@Override
	public void update(Student student) {
		String sql = "update student_t stu" + 
				"   set stu.student_name = ?," + 
				"       stu.student_gender = ?," + 
				"       stu.student_age = ?," + 
				"       stu.student_major = ?" + 
				" where stu.student_id = ?";
		jdbc.update(sql,
				student.getName(),
				String.valueOf(student.getGender()),
				student.getAge(),
				student.getMajor(),
				student.getNumber());
		
	}

	@Override
	public List<Student> findAll() {
		String sql = "select * from student_t";
		return jdbc.query(sql ,  new StudentRowMapper());
	}

}
