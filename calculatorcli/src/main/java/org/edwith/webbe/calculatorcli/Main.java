package org.edwith.webbe.calculatorcli;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		CalculatorService calculatorService = applicationContext.getBean(CalculatorService.class);
		
		System.out.println(calculatorService.plus(10, 50));
		
	}

}
