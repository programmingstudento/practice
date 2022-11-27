package com.collections.learn;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.time.LocalDateTime;

public class ArrayType {

	public static void main(String[] args) {
		System.out.println(arrayType(new char[] {}));
		System.out.println(arrayType(new int[] {}));
		System.out.println(arrayType(new short[] {}));
		System.out.println(arrayType(new String[] {}));
		System.out.println(arrayType(new Long[] {}));
		System.out.println(arrayType(false));
		System.out.println(arrayType(2.3F));
		System.out.println(arrayType(null));
		System.out.println(arrayType(LocalDateTime.now()));

		Object one = Array.newInstance(int.class, 5);
		System.out.println(arrayType(one));
		fill(one);
		display(one);

		System.out.println();
		Object two = doubleArray(one);
		display(two);
	}

	// returns null for non-array and null.
	public static String arrayType(Object object) {
		String result = null;
		if (object != null) {
			Class<? extends Object> one = object.getClass();
			if (one.isArray()) {
				result = one.getComponentType().getName();
			}
		}

		return result;
	}

	public static void fill(Object item) {
		SecureRandom random = new SecureRandom();
		if (item != null) {
			Class<? extends Object> one = item.getClass();
			if (one.isArray()) {
				int size = Array.getLength(item);
				for (int index = 0; index < size; index++) {
					Array.setInt(item, index, random.nextInt(1, 11));
				}
			}
		}
	}

	public static void display(Object item) {
		if (item != null) {
			Class<? extends Object> one = item.getClass();
			if (one.isArray()) {
				int size = Array.getLength(item);
				for (int index = 0; index < size; index++) {
					System.out.println("Index : " + index + " : " + Array.get(item, index));
				}
			}
		}
	}

	public static Object doubleArray(Object item) {
		Object result = null;
		if (item != null) {
			Class<? extends Object> one = item.getClass();
			if (one.isArray()) {
				result = Array.newInstance(int.class, Array.getLength(item) * 2);
				System.arraycopy(item, 0, result, 0, Array.getLength(item));
			}
		}
		return result;
	}
}
