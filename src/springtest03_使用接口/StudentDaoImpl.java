package springtest03_使用接口;

import java.util.ArrayList;
import java.util.List;

import springtest03_使用接口.EnumType.Gender;


public class StudentDaoImpl implements StudentDao {
	
	@Override
	public List<Student> queryAll(){
		List<Student> list = new ArrayList<>();
		
		Student student1 = new Student(1, "张三", Gender.Famale, 16, "财会");
		Student student2 = new Student(2, "李四", Gender.Male, 18, "财会");
		Student student3 = new Student(3, "王五", Gender.Male, 17, "财会");

		list.add(student1);
		list.add(student2);
		list.add(student3);
		return list;
		
	}
	
}
