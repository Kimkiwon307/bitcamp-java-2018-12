package ch29.k1;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@MapperScan("ch29.k1.dao")
public class MybatisConfig {

	@Value("${jdbc.url}")String jdbcUrl;
	@Value("${jdbc.driver}") String jdbcdriver;
	@Value("${jdbc.username}") String jdbcusername;
	@Value("${jdbc.password}") String jdbcpassword;
	
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource, ApplicationContext appCtx) throws Exception{
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource);
		sqlSessionFactoryBean.setTypeAliasesPackage("ch29.k1.vo");
		sqlSessionFactoryBean.setMapperLocations(appCtx.getResources("classpath:ch29/k1/mapper/*.xml"));
		return sqlSessionFactoryBean.getObject();
	}
}
