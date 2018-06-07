package springtest03_使用接口;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Springtest03 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("./springtest03_使用接口/beans.xml");
		StudentController studentController = context.getBean(StudentController.class);
		studentController.list();
	}
}
