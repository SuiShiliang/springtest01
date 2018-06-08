package springtest01_课堂代码;

import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component 告诉spring扫描器，运行将其在beans.xml注册成bean，
//如果没有添加,那么此类将不会添加到bean中，会使得获取该类时报无法找到的错误
@Component
public class TestA {

	public void printdd() {
		System.out.println("这是A");
		System.out.println("想知道时间吗？只有A可以输出时间哦");
		System.out.println(new Date().toString());
	}
}
