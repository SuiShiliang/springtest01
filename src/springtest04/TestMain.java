package springtest04;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
			new ClassPathXmlApplicationContext("./springtest04/beans.xml");
		TestSendMessage message = context.getBean(TestSendMessage.class);
		String username = "小明";
		String username2 = "小红";
		String message1 = "爱你一万年，爱你值得改变";
		message.sendMessage(username, username2, message1);
	}

}
