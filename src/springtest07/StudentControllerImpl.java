package springtest07;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentControllerImpl implements StudentController {

	
	private StudentService service;
	@Autowired
	public StudentControllerImpl(StudentService service) {
		this.service = service;
	}

	@Override
	public Student findone(Integer id) {
		return service.findone(id);
	}

	@Override
	public void add(Student student) {
		service.add(student);
	}

	@Override
	public void delete(Integer id) {
		service.delete(id);
	}

	@Override
	public void update(Student student) {
		service.update(student);
	}

	@Override
	public void findAll() {
		List<Student> list = service.findAll();
		System.out.println("查询出所有的数据：");
		for(Student s : list) {
			System.out.println(
					"id："+s.getNumber()+
					"\t姓名:"+s.getName()+
					"\t性别:"+s.getGender()+
					"\t年龄:"+s.getAge()+
					"\t专业:"+s.getMajor());
		}
	}

}
