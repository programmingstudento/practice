package com.collections.learn;

import java.util.Arrays;

public class ArrayTriple {
	public static void main(String[] args) {
		var names = new String[] { "Java", "SQL", "Typescript", "Scala" };
		System.out.println(Arrays.toString(names));
		System.out.println(names.length);

		var names1 = tripleArray(names);
		System.out.println(Arrays.toString(names1));
		System.out.println(names1.length);
	}

	private static String[] tripleArray(String[] names) {
		String[] result = new String[names.length * 3];
		System.arraycopy(names, 0, result, 0, names.length);
		return result;
	}
}
