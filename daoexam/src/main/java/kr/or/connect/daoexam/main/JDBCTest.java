package kr.or.connect.daoexam.main;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.or.connect.daoexam.config.Applicationconfig;
import kr.or.connect.daoexam.dao.RoleDao;
import kr.or.connect.daoexam.dto.Role;

public class JDBCTest {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(Applicationconfig.class);
		
		RoleDao roleDao = ac.getBean(RoleDao.class);
		
//		Role role = new Role();
//		role.setRoleId(500);
//		role.setDescription("장원영");
//		
//		int count = roleDao.insert(role);
		
		
		Role role = new Role();
		role.setRoleId(100);
		role.setDescription("사쿠라");
		System.out.println(role);
		
		int count = roleDao.update(role);
		System.out.println(count + "건 처리했습니다.");
		
		
		
		Role resultRole = roleDao.selectById(100);
		System.out.println(resultRole);
		
		int deleteCount = roleDao.deleteById(500);
		System.out.println(deleteCount + "건 삭제했습니다.");
		
		Role deleteTestRole = roleDao.selectById(500);
		System.out.println(deleteTestRole);
	}
}
