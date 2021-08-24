package kr.or.connect.diexam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextExam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Car car = (Car) ac.getBean("car");
		Car car2 = (Car) ac.getBean(Car.class);
		
		car.run();

	}

}
