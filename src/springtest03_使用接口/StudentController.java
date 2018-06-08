package springtest03_使用接口;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class StudentController {

	private StudentService service;
	@Autowired
	public StudentController(StudentService service) {
		super();
		this.service = service;
	}

	public void list() {
		List<Student> list = service.findAll();
		for(Student student : list) {
			System.out.println(student);
			System.out.println();
		}
	}
}
