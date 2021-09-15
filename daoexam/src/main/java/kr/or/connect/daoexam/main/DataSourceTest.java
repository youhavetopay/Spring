package kr.or.connect.daoexam.main;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.or.connect.daoexam.config.Applicationconfig;

public class DataSourceTest {
	
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(Applicationconfig.class);
		
		DataSource ds= ac.getBean(DataSource.class);
		
		Connection connection = null;
		
		try {
			connection = ds.getConnection();
			
			if(connection != null) {
				System.out.println("접속 성공");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		} finally {
			if(connection != null) {
				
				try {
					connection.close();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
	}
}
