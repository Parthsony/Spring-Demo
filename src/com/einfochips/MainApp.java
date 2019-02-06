package com.einfochips;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("Beans.xml");

		Message message1 = (Message) appContext.getBean("message");
		message1.setMessage("First instance's message");

		Message message2 = (Message) appContext.getBean("message");

		System.out.println(message1.getMessage());
		System.out.println(message2.getMessage());

		appContext.registerShutdownHook();
		appContext.close();

	}

}
