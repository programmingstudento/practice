package com.collections.learn;

import java.util.Enumeration;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Vector;

public class Enumerations {

	public static void main(String[] args) {
		for (Enumeration<String> enumeration = new Vector<>(List.of("Orange", "Banana")).elements(); enumeration
				.hasMoreElements();) {
			System.out.println(enumeration.nextElement());
		}

		StringTokenizer stringTokenizer = new StringTokenizer("Orange Lemon Guava Watermelon");
		for (; stringTokenizer.hasMoreTokens();) {
			System.out.println(stringTokenizer.nextToken());
		}
	}
}
