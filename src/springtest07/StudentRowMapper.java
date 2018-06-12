package springtest07;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import springtest07.EnumType.Gender;


public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int arg1) throws SQLException {
		
		Student student = new Student();
		student.setNumber(rs.getInt(1));
		student.setName(rs.getString(2));
		student.setGender(Gender.valueOf(rs.getString(3)));
		student.setAge(rs.getInt(4));
		student.setMajor(rs.getString(5));
		return student;
	}

}
