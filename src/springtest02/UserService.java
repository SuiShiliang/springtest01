package springtest02;

public class UserService {

	private UserDao dao;

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	public void register(String username, String password) {
		System.out.println("正在检查用户名" + username + "是否存在，存在是不能创建这个账户的...");

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(1000);
					if (dao.usernameExists(username)) {
						System.out.println("正在加密明文密码...");
						Thread.sleep(1000);
						dao.insert(username, password);
					} else {
						System.out.println("经过检查，发现在我们的资料库中，该账户" + username + "已经被使用了，所以，请换一个名吧！");
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		thread.start();

	}
}
