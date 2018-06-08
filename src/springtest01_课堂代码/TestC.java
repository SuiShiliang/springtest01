package springtest01_课堂代码;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class TestC {

	private TestB b;
	/*@Autowired
	 * 告诉扫描器，此类有参数需要注入，可以在变量名上添加
	 * */
	@Autowired
	public TestC(TestB b ) {
		this.b = b;
		
	}
	public void printdd() {
		System.out.print("这是C（使用构造注入）中使用了B类:");
		b.printdd();
	}
}
