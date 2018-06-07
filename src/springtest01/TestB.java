package springtest01;

public class TestB {

	private TestA a;
	
	public TestA getA() {
		return a;
	}

	public void setA(TestA a) {
		this.a = a;
	}

	public void printdd() {
		System.out.print("这是B（使用setter注入）,使用A类:");
		a.printdd();
	}
}
