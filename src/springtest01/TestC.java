package springtest01;

public class TestC {

	private TestB b;
	
	public TestC(TestB b ) {
		this.b = b;
		
	}
	public void printdd() {
		System.out.print("这是C（使用构造注入）中使用了B类:");
		b.printdd();
	}
}
