package ch29.k1;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@PropertySource("classpath:ch29/k1/jdbc.properties")
public class DatabaseConfig {

	@Value("${jdbc.url}")String jdbcUrl;
	@Value("${jdbc.driver}") String jdbcdriver;
	@Value("${jdbc.username}") String jdbcusername;
	@Value("${jdbc.password}") String jdbcpassword;

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName(this.jdbcdriver); 
		ds.setUrl(this.jdbcUrl);
		ds.setUsername(this.jdbcusername);
		ds.setPassword(this.jdbcpassword);
		return ds;
	}

	@Bean
	public PlatformTransactionManager transactionManager(DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource); 
	}
}
