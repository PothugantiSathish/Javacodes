package com.springmvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

public class MVCconfig {

	@Configuration
	@ComponentScan(basePackages = "com.springmvc")
	public class MvcClassName {

	}
}
