package springtest01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		System.out.println("这是一个用来测试的项目");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("./springtest01/beans.xml");
		TestC c = context.getBean(TestC.class);
		c.printdd();
	}
}
