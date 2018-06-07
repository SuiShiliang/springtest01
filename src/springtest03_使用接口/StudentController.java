package springtest03_使用接口;

import java.util.List;

public class StudentController {

	private StudentService service;
	
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
