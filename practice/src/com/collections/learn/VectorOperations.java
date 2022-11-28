package com.collections.learn;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorOperations {

	public static void main(String[] args) {
		Vector<String> countries = new Vector<>(
				List.of("USA", "INDIA", "CHINA", "FRANCE", "GERMANY", "GREAT BRITAIN", "SOUTH KOREA", "JAPAN"));
		String japan = countries.get(countries.size() - 1);
		System.out.println(japan);
		System.out.println("Countries\n");
		for (var country : countries) {
			System.out.println(country);
		}

		System.out.println(countries.firstElement() + " " + countries.lastElement());

		Enumeration<String> enumeration = countries.elements();
		StringBuilder builder = new StringBuilder();
		while (enumeration.hasMoreElements()) {
			builder.append(enumeration.nextElement() + " ");
		}
		builder.delete(builder.length() - 1, builder.length());
		System.out.println(builder);

		Iterator<String> iterator = countries.iterator();
		builder = new StringBuilder();
		while (iterator.hasNext()) {
			builder.append(iterator.next() + " ");
		}
		builder.delete(builder.length() - 1, builder.length());
		System.out.println(builder);

		String[] country = new String[countries.size()];

		countries.copyInto(country);
		System.out.println(Arrays.toString(country));

		List<String> one = countries.subList(0, 2);
		one.set(1, "INDONESIA");
		System.out.println(countries);
	}
}
