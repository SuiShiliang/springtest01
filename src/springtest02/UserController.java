package springtest02;

public class UserController {
	
	public UserController(UserService service) {
		this.service = service;
	}
	
	private UserService service;
	
	public void register(String username, String password) {
		System.out.println("正在注册账户："+username+"...");
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(1000);
					service.register(username, password);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		thread.start();
		
	}
}
