package springtest02_练习;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Springtest02 {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("./springtest02_练习/beans.xml");
		UserController controller = context.getBean(UserController.class);
		/*UserService service = context.getBean(UserService.class);
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(1500);
					service.register("admin", "123456");
				} catch (InterruptedException e) {
					System.out.println("诶呀！线程函数出错了");
					e.printStackTrace();
				}
			}
		});
		thread.start();*/
		controller.register("使用controller", "123456");
	}

}
