package com.spring.basic1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class UseBike {

	public static void main(String[] args) {
		Resource resource=new ClassPathResource("springioc.xml");//configuration file access the class path resource
		BeanFactory factory=new XmlBeanFactory(resource);
		SpringBike bike=factory.getBean("bike",SpringBike.class);
		bike.ride();

	}

}
