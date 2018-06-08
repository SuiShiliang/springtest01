package springtest03_使用接口;

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
public class StudentDaoImpl implements StudentDao {
	
	//该处导入的是DataSource，导入的包是“javax.sql.DataSource”
	private DataSource dataSource;
	
	@Autowired
	public StudentDaoImpl(DataSource dataSource) {
		this.dataSource = dataSource;
	}


	@Override
	public List<Student> queryAll(){
		List<Student> list = new ArrayList<>();
		/*
		Student student1 = new Student(1, "张三", Gender.Famale, 16, "财会");
		Student student2 = new Student(2, "李四", Gender.Male, 18, "财会");
		Student student3 = new Student(3, "王五", Gender.Male, 17, "财会");

		list.add(student1);
		list.add(student2);
		list.add(student3);*/
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
		}finally {
			if(null != conn) {
				try {
					conn.close();
				} catch (SQLException e) {
					System.out.println("数据库连接无法关闭");
					e.printStackTrace();
				}
			}
		}
		
		return list;
		
	}
	
}
