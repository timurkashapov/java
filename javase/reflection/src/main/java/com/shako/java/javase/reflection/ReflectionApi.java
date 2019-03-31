package com.shako.java.javase.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionApi {

	public static void main(String[] args) {

		Clazz clazz = new Clazz();

		int number = clazz.getNumber();
		String name = null;
		System.out.println(new StringBuilder()
				.append(number)
				.append(" ")
				.append(name));

		try {
			Field field = clazz.getClass().getDeclaredField("name"); // получаем private поле
			field.setAccessible(true); // делаем публичность этому полю
			field.set(clazz, "value");
			name = (String) field.get(clazz); // получаем значение поля

			Method method = clazz.getClass().getDeclaredMethod("printData");
			method.setAccessible(true);
			method.invoke(clazz);

			System.out.println();
			System.out.println(clazz.getClass().getName());
			System.out.println(clazz.getClass().getSimpleName());
			System.out.println(clazz.getClass().getCanonicalName());
			System.out.println(clazz.getClass().getClassLoader());
		} catch (NoSuchMethodException
				| NoSuchFieldException
				| IllegalAccessException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
