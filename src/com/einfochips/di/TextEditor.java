package com.einfochips.di;

public class TextEditor {

	private SpellChecker spellCheker;

	public TextEditor(SpellChecker spellChecker) {
		System.out.println("Inside Text Editor Constructor");
		this.spellCheker = spellChecker;
	}

	public void spellCheck() {
		spellCheker.checkSpelling();
	}
}
