package springtest07;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "springtest07")
@PropertySource("classpath:./springtest07/jdbc.properties")
public class AppConfig {

	@Bean
	public DataSource dataSource(Environment env) {
		DriverManagerDataSource source =
				new DriverManagerDataSource(
						env.getProperty("jdbc.url"),
						env.getProperty("jdbc.username"),
						env.getProperty("jdbc.password"));
		source.setDriverClassName(env.getProperty("jdbc.className"));
		return source;
	}
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource source) {
		return new JdbcTemplate(source);
	}
}
