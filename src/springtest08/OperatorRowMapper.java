package springtest08;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class OperatorRowMapper implements RowMapper<Operator> {

	@Override
	public Operator mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		
		Integer id = rs.getInt("O_ID");
		String username = rs.getString("O_USERNAME");
		String password = rs.getString("O_PASSWORD");
		String role = rs.getString("O_ROLE");
		Boolean disablead = rs.getBoolean("O_DISABLED");
		Operator operator = new Operator(id, username, password, role, disablead);
		return operator;
	}

}
