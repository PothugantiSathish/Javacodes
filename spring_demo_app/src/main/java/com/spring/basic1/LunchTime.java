package com.spring.basic1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LunchTime {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext("springioc.xml");
		
		SpringHotel hotel=context.getBean("springHotel",SpringHotel.class);
		hotel.eat();

	}

}
