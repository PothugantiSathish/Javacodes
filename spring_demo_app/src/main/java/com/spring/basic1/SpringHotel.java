package com.spring.basic1;

import org.springframework.stereotype.Component;

@Component  //it represents that this class is registered with IOC container
public class SpringHotel {
	
	public void eat() {
		System.out.println("eat food have  water repeat again");
		System.out.println("===============");
		
	}

}
