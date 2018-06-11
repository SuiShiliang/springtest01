package springtest05;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import springtest03_使用接口.EnumType.Gender;

@Component
public class SendMessageImpl implements SendMessage {

	
	TestPrint testp;
	DataSource dataSource;

	@Autowired
	//使用构造器时，务必使两个参数都有
	public SendMessageImpl(TestPrint testp, DataSource dataSource) {
		super();
		this.testp = testp;
		this.dataSource = dataSource;
	}




	@Override
	public void sendMessage() {
		
		List<Student> list = new ArrayList<>();
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			String sql = "select * from student_t";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int number = rs.getInt(1);
				String name = rs.getString(2);
				Gender gender = Gender.valueOf(rs.getString(3));
				int age = rs.getInt(4);
				String major = rs.getString(5);
				Student student = new Student(number, name, gender, age, major);
				list.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		testp.printMessage(list);
	}

}
