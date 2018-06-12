package springtest06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
@Component
public class Server {

	private String host;
	private Integer port;
	
	public String getHost() {
		return host;
	}
	public Integer getPort() {
		return port;
	}
	@Autowired
	public Server(Environment env) {
		this.host = env.getProperty("server.host");
		this.port = Integer.parseInt(env.getProperty("server.port"));
	}
	
	public void start() {
		System.out.println("正在启动服务器（主机："+this.getHost()+"，端口："+this.getPort()+"）");
	}
	
}
