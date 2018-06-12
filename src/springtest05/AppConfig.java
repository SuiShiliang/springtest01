package springtest05;

import java.io.IOException;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "springtest05")
@PropertySource({"classpath:./springtest03_使用接口/jdbc.properties"
		, "classpath:./springtest05/App.properties"})//使用依赖注入配置文件
public class AppConfig {
	@Bean
	public DataSource dataSource(Environment env) throws IOException {
		//TODO 使用打开文件的方式，获取配置文件中的信息，不够可靠，基本只可在本机使用
		/*FileInputStream inputStream = new FileInputStream(
				new File("E:\\JavaStudyFile\\eclipse\\springtest01\\src\\springtest05\\jdbc.properties"));
		Properties properties = new Properties();
		properties.load(inputStream);
		String url = properties.getProperty("jdbc.url");
		String username = properties.getProperty("jdbc.username");
		String password = properties.getProperty("jdbc.password");
		String driverClass = properties.getProperty("jdbc.dirverClass");*/
		//TODO 使用固定死的数据连接数据库
		/*String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String username = "TEST_STORE";
		String password = "123456";
		String driverClass = "oracle.jdbc.OracleDriver";*/
		//TODO 使用依赖注入配置文件
		String url = env.getProperty("jdbc.url");
		String username = env.getProperty("jdbc.username");
		String password = env.getProperty("jdbc.password");
		String driverClass = env.getProperty("jdbc.dirverClass");
		DriverManagerDataSource source = new DriverManagerDataSource(url,username,password);
		source.setDriverClassName(driverClass);
		return source;
	}
}
