package springtest05;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

public class MainTest {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		//加载的文件是AppConfig.class，而不是AppConfig.Java 
		//括号中直接使用AppConfig.class , 不需要添加双引号
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		/*ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("./springtest05/beans.xml");*/
		SendMessage sendMessage = context.getBean(SendMessage.class);
		sendMessage.sendMessage();
		Environment env = context.getBean(Environment.class);
		String saySomething = env.getProperty("app.config");
		System.out.println(saySomething);
		
	}

}
