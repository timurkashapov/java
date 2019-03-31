package com.shako.java.javase.reflection;

import java.util.Arrays;

public class ReflectionApi {

	{

	}

	public static void main(String[] args) {

		Object obj = new Object();

		System.out.println(
				Arrays.toString(
						obj.getClass().getMethods()));
	}
}
