package springtest01_课堂代码;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		System.out.println("这是一个用来测试的项目");
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("./springtest01_课堂代码/beans.xml");
		TestC c = context.getBean(TestC.class);
		c.printdd();
	}
}
