package kr.or.connect.daoexam.main;




import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.transaction.annotation.AnnotationTransactionAttributeSource;

import kr.or.connect.daoexam.config.Applicationconfig;
import kr.or.connect.daoexam.dao.RoleDao;
import kr.or.connect.daoexam.dto.Role;

public class SelectAllTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Applicationconfig.class);
		
		RoleDao roleDao = applicationContext.getBean(RoleDao.class);
		
		List<Role> list = roleDao.selectAll();
		
		for(Role role : list) {
			System.out.println(role);
		}
		
	}
}
