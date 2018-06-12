package springtest08;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		OperatorDao dao = context.getBean(OperatorDao.class);
		//查询所有数据
		dao.printAll(dao.finaAll());
		//添加一个用户信息
		String username = "老李";
		String password = "123456";
		String role = "salesman";
		dao.create(username, password, role);
		dao.printAll(dao.finaAll());
	/*	//修改密码
		dao.updatePassword(8, "678910");
		dao.printAll(dao.finaAll());*/
		//删除一条用户信息
		/*dao.delete(8);
		dao.printAll(dao.finaAll());*/
		/*//修改权限：开启
		dao.enable(7);
		dao.printAll(dao.finaAll());
		//修改权限：关闭
		dao.disable(7);
		dao.printAll(dao.finaAll());*/
	}

}
