package springtest04;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class Test1SendMessageImpl implements TestSendMessage {

	@Override
	public boolean sendMessage(String username, String username2, String message) {
		System.out.println("扫描若出现了相同的接口实现类，优先调用此实现类");
		System.out.println(String.format("【%s】向【%s】发送了信息：【%s】", username,username2,message));
		return false;
	}

}
