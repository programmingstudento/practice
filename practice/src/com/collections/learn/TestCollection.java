package com.collections.learn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class TestCollection {
	public static void main(String[] args) {
		ArrayList<String> places = new ArrayList<>();
		places.add("Kathmandu");
		places.add("Biratnagar");
		places.add("Pokhara");
		places.add("Janakpur");

		System.out.println(places);
		System.out.println(places.contains("Pokhara"));

		System.out.println(places.remove("Janakpur"));
		System.out.println(places.size());

		Collection<String> places1 = new ArrayList<>();
		places1.add("Bharatpur");
		places1.add("Birgunj");
		places1.add("Lahan");
		places1.add("Kathmandu");

		System.out.println(places1);

		@SuppressWarnings("unchecked")
		ArrayList<String> places2 = (ArrayList<String>) places.clone();
		places2.addAll(places1);

		System.out.println(places2);

		Iterator<String> iterator = places2.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toUpperCase());
		}
		places2.forEach(new Consumer<String>() {

			@Override
			public void accept(String city) {
				System.out.println(city.toUpperCase());
			}
		});

		for (String city : places2) {
			System.out.println(city.toUpperCase());
		}

		places2.forEach(city -> city.toUpperCase());
	}
}
