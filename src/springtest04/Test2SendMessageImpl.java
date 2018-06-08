package springtest04;

import org.springframework.stereotype.Service;

@Service
public class Test2SendMessageImpl implements TestSendMessage {

	@Override
	public boolean sendMessage(String username, String username2, String message) {
		System.out.println(String.format("【%s】向【%s】发送了信息：【%s】", username,username2,message));
		return false;
	}

}
