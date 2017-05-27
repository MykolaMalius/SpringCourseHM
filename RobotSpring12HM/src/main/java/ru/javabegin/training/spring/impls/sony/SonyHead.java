package ru.javabegin.training.spring.impls.sony;

import ru.javabegin.training.spring.interfaces.Head;

public class SonyHead implements Head {
	
	private int size;
	private String color;

	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}
	
	

	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public void calc() {
		System.out.println("Thinking about Sony...");
	}
	
	
}
