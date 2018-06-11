package springtest05;

import org.springframework.stereotype.Component;

@Component
public class TestPrintImpl implements TestPrint {

	@Override
	public void printMessage(Object... objects) {
		
		for(Object obj : objects) {
			System.out.println(obj.toString());
		}

	}

}
