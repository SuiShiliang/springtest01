package springtest02;

public class UserDao {

	public boolean usernameExists(String username) {
		if("admin".equals(username))
			return false;
		return true;
	}
	
	public void insert(String username,String encodedPassword) {
		System.out.println("正在创建用户....");
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(1000);
					System.out.println("用户"+username+"创建成功，恭喜成为了我们的一员！");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		thread.start();
	}
}
