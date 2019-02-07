package com.einfochips.di;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {

	@Autowired
	private SpellChecker spellCheker;

	public TextEditor() {
		System.out.println("Inside Text Editor Constructor");
	}

	public void spellCheck() {
		spellCheker.checkSpelling();
	}
}
