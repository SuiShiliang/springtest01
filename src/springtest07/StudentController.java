package springtest07;


public interface StudentController {

	public Student findone(Integer id);
	public void add(Student student);
	public void delete(Integer id);
	public void update(Student student);
	public void findAll();
}
