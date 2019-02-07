package com.einfochips;

import lombok.Data;

@Data
public class Message {

	private String message1;
	private String message2;

	public void init() {
		System.out.println("Spring is going to be in its initialization state");
	}

	public void destroy() {
		System.out.println("Bean will destroy now");
	}

}
