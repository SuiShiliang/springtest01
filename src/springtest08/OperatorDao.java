package springtest08;

import java.util.List;

public interface OperatorDao {

	List<Operator> finaAll();
	Operator findOne(Integer id);
	void create(String username, String password, String role);
	void updatePassword(Integer id, String newPassword);
	void delete(Integer id);
	void disable(Integer id);
	void enable(Integer id);
	public void printAll(List<Operator> list);
}
