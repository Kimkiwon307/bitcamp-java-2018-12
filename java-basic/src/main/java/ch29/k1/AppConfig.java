package ch29.k1;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;

@PropertySource("classpath:ch29/k1/jdbc.properties")

//Mybatis DAO 구현체 자동 생성하기
// => @MapperScan(DAO 인터페이스가 들어 있는 패키지)
@MapperScan("ch29.k1.dao")
public class AppConfig {

	@Value("${jdbc.url}")String jdbcUrl;
	
	@Value("${jdbc.driver}") String jdbcdriver;
	
	@Value("${jdbc.username}") String jdbcusername;
	
	@Value("${jdbc.password}") String jdbcpassword;
	
	// DB 커넥션풀 객체 준비
	  @Bean
	  public DataSource dataSource() {
		  // spring-jdbc 라이브러리에서 제공해주는 클래스를 사용하여 DataSource 구현체 만들기
	    DriverManagerDataSource ds = new DriverManagerDataSource();
	    ds.setDriverClassName(this.jdbcdriver); 
	    ds.setUrl(this.jdbcUrl);
	    ds.setUsername(this.jdbcusername);
	    ds.setPassword(this.jdbcpassword);
	    return ds;
	  }

	  // 트랜잭션 관리자 준비
	  // => Spring IoC 컨테이너에서 트랜잭션 관리자를 찾을 때
	  // 	 "transactionManager"라는 이름으로 찾는다.
	  // => 따라서 가능한 트랜잭션 관리자 이름을 이에 맞춰 "transactionManager"로 지어라.
	  // => 만약 다른 이름으로 짓는다면 트랜잭션과 관련된 객채를 다룰 때 매번트랜잭션 관리자 이름을 지정해야 하는 번거롬이 있따
	  @Bean
	  public PlatformTransactionManager transactionManager(DataSource dataSource) {
		  	return new DataSourceTransactionManager(dataSource); 
	  }
	  
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource, ApplicationContext appCtx) throws Exception{
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		
		sqlSessionFactoryBean.setDataSource(dataSource);
		
		sqlSessionFactoryBean.setTypeAliasesPackage("ch29.k1.vo");
		
		sqlSessionFactoryBean.setMapperLocations(appCtx.getResources("classpath:ch29/k1/mapper/*.xml"));
		
		
		return sqlSessionFactoryBean.getObject();
	}
}
