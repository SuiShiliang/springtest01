package springtest01_课堂代码;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//告诉扫描器，添加此类到bean中
@Component
public class TestB {
	/*@Autowired
	 * 可以在此处添加
	 * */
	private TestA a;
	
	public TestA getA() {
		return a;
	}
	/*@Autowired 告诉扫描器，此类拥有参数需要注入，此处为setter注入
	 * @Autowired 可以在注入变量名前添加
	 * */
	@Autowired
	public void setA(TestA a) {
		this.a = a;
	}

	public void printdd() {
		System.out.print("这是B（使用setter注入）,使用A类:");
		a.printdd();
	}
}
