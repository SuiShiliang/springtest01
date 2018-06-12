package springtest07;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springtest07.EnumType.Gender;

public class Test {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		StudentController controller = context.getBean(StudentController.class);
		//根据id查询账户信息
		System.out.println(controller.findone(2));
		controller.findAll();
		//添加用户
		Student student = new Student();
		student.setName("陈一雄二二");
		student.setGender(Gender.Famale);
		student.setAge(45);
		student.setMajor("吃货");
		controller.add(student);
		controller.findAll();
		//修改用户
		/*student.setNumber(22);
		student.setName("小er");
		student.setGender(Gender.Famale);
		student.setAge(18);
		student.setMajor("旅游dd");
		controller.update(student);
		controller.findAll();*/
		//删除用户
		controller.delete(22);
		controller.findAll();

	}

}
