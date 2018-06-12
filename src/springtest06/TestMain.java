package springtest06;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(Appconfig.class);
		Server server = context.getBean(Server.class);
		server.start();
	}

}
