package kr.or.connect.daoexam.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
// 트랜잭션
@EnableTransactionManagement 
public class DBConfig {
	
	private String driverClassName = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/izone?useUnicode=true&character=UTF-8";
	private String userName = "root";
	private String password = "zkwpdlxm!2";
	
	@Bean
	public DataSource dataSourse() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(driverClassName);
		dataSource.setUrl(url);
		dataSource.setUsername(userName);
		dataSource.setPassword(password);
		return dataSource;
	}

}
