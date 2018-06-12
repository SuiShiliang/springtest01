package springtest07;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StudentServiceImpl implements StudentService {

	private StudentDao dao;
	@Autowired
	public StudentServiceImpl(StudentDao dao) {
		this.dao = dao;
	}

	@Override
	public Student findone(Integer id) {
		return dao.findone(id);
	}

	@Override
	public void add(Student student) {
		dao.add(student);
		
	}

	@Override
	public void delete(Integer id) {
		dao.delete(id);
		
	}

	@Override
	public void update(Student student) {
		dao.update(student);
		
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
