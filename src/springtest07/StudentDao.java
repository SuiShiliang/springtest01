package springtest07;

import java.util.List;

public interface StudentDao {

	public Student findone(Integer id);
	public void add(Student student);
	public void delete(Integer id);
	public void update(Student student);
	public List<Student> findAll();
}
