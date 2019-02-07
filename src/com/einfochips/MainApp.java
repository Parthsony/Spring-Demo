package com.einfochips;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.einfochips.di.TextEditor;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("Beans.xml");
		
		TextEditor editor = (TextEditor) appContext.getBean("textEditor");
		editor.spellCheck();
	}

}
