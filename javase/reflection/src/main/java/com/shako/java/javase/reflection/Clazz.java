package com.shako.java.javase.reflection;

public class Clazz {

	private int number;
	private java.lang.String name;

//	public Clazz(int number, java.lang.String name) {
//		this.number = number;
//		this.name = name;
//	}

	public int getNumber() {
		return number;
	}

	public void setNumber(final int number) {
		this.number = number;
	}

	public void setName(final String name) {
		this.name = name;
	}

	private void printData() {
		System.out.println(new StringBuilder()
				.append(name)
				.append(" ")
				.append(number));
	}
}
