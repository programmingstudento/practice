package com.reflection.learn;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Sample {

	public static void main(String[] args) {
		try {

			Constructor<?>[] constructors = String.class.getConstructors();
			for (Constructor<?> constructor : constructors) {
				System.out.println(Arrays.toString(constructor.getParameters()));
			}

			Constructor<String> one = String.class.getConstructor(char[].class);
			String number = one.newInstance(new char[] { 'j', 'a', 'v', 'a' });
			System.out.println(number);
		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
