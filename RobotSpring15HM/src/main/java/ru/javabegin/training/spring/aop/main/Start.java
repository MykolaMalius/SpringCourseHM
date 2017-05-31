package ru.javabegin.training.spring.aop.main;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ru.javabegin.training.spring.aop.objects.SomeService;

public class Start {

	public static void main(String[] args) {
		System.out.println("Enter your number please");
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		SomeService service = (SomeService) context.getBean("someService");
		

		 
		double val = service.getDoubleValue();
	}
}
