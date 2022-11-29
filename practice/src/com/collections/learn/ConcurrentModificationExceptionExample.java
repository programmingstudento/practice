package com.collections.learn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExceptionExample {

	public static void main(String[] args) {
		List<String> foods = new ArrayList<>();
		foods.add("Paani Puri");
		foods.add("Samosa Chaat");
		foods.add("Pizza");
		foods.add("Egg Roll");

		Iterator<String> iterator = foods.iterator();
		for (; iterator.hasNext();) {
			System.out.println(iterator.next()); // java.util.ConcurrentModificationException
			foods.add("Pasta");
		}
	}
}
