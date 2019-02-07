package com.einfochips;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("Beans.xml");
		
		Message message = (Message) appContext.getBean("message");
		
		HelloIndia hi = (HelloIndia) appContext.getBean("helloIndia");
		
		
		System.out.println(message.getMessage1());
		System.out.println(message.getMessage2());
		
		System.out.println(hi.getMessage1());
		System.out.println(hi.getMessage2());
		System.out.println(hi.getMessage3());
		
		
		

	}

}
