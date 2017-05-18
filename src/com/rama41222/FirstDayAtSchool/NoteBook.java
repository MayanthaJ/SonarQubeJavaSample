package com.rama41222.FirstDayAtSchool;

public class NoteBook extends Book{
	String text = "";

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = this.text + "\n" + text;
	}

	public NoteBook(String name) {
		super(name);
	}
}
