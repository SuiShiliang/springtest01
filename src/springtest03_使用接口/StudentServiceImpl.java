package springtest03_使用接口;

import java.util.List;

public class StudentServiceImpl implements StudentService {

	private StudentDao dao;
	public StudentServiceImpl(StudentDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public List<Student> findAll() {
		return dao.queryAll();
	}

}
