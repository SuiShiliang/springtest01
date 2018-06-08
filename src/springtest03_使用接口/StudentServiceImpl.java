package springtest03_使用接口;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class StudentServiceImpl implements StudentService {

	@Autowired
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
