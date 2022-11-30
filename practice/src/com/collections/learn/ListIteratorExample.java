package com.collections.learn;

import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		List<String> names = List.of("Apple", "Banana", "Cherry", "Dragon Fruit", "Guava", "Mango");
		ListIterator<String> iterator = names.listIterator();
		System.out.println("-------------------Forward---------------------------");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("-------------------Reverse----------------------------");
		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
	}
}
