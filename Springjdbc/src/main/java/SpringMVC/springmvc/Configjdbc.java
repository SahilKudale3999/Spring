package SpringMVC.springmvc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("SpringMVC.springmvc")
public class Configjdbc {

	@Bean
	public JdbcTemplate jdbctemp() {
		return new JdbcTemplate(dmd());                                
	}
	@Bean
	public DataSource dmd() {
		
		DriverManagerDataSource d = new DriverManagerDataSource();
		d.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		d.setUsername("system");
		d.setPassword("sahil");
		d.setDriverClassName("oracle.jdbc.OracleDriver");
		return d;
	}
}
