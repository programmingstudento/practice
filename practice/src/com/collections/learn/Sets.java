package com.collections.learn;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {

		Set<String> sortedSet = new TreeSet<>();
		sortedSet.add("LG");
		sortedSet.add("SAMSUNG");
		sortedSet.add("PHILIPS");
		sortedSet.add("SONY");

		String one = new String("SONY");
		String two = new String("SONY");
		System.out.println(one.equals(two));
		Set<String> three = new HashSet<>();
		System.out.println(three.add(one));
		System.out.println(three.add(two));
		three.add("PHILIPS");
		three.add("LG");
		three.add("SAMSUNG");
		System.out.println(three.contains("LG"));
		System.out.println(three.containsAll(List.of("LG", "SAMSUNG")));

		for (Iterator<String> iterator = three.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}
		System.out.println();
		System.out.println(sortedSet.equals(three));
	}
}
