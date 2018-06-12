package springtest06;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "springtest06")
@PropertySource("classpath:./springtest06/server.properties")
public class Appconfig {

}
