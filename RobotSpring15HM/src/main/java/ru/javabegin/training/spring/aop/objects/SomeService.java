package ru.javabegin.training.spring.aop.objects;



import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SomeService  {
	

 Scanner sc = new Scanner(System.in);
 double x = sc.nextDouble();
 double y = sc.nextDouble();
	
 

  public int getIntValue() {
		return 5;
	}
	
	

	public double getDoubleValue() {
		
		return x/y;
	}

}
