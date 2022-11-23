package com.homework.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		FootballPlayer one = new FootballPlayer("Radha", "Sharma", 25),
				two = new FootballPlayer("Radhika", "Singh", 27), three = new FootballPlayer("Radha", "Sharma", 25),
				four = new FootballPlayer("Radhika", "Singh", 27);
		Set<FootballPlayer> footballPlayers = new HashSet<>();
		footballPlayers.add(one);
		footballPlayers.add(two);

		System.out.println(Objects.equals(one, three));
		System.out.println(one.hashCode() + " " + two.hashCode());
		System.out.println(footballPlayers.contains(three));
		

		// uncommenting hashCode()
		System.out.println("Equal " + Objects.equals(one, three));
		System.out.println(one.hashCode() + " " + two.hashCode());
		System.out.println("Contains " + footballPlayers.contains(three));
		

		System.out.println("Adding " + footballPlayers.add(four)); // does not add four.
		

		Map<FootballPlayer, Integer> test = new HashMap<>();
		test.put(one, 1);
		System.out.println(test.get(one) + " " + test.get(new FootballPlayer("Radha", "Sharma", 25)));
		test.put(two, 2);
		System.out.println(test.get(two) + " " + test.get(four));
		
		test.put(three, 3);
		System.out.println(test.put(three, 3));
		System.out.println(test.get(one) + " " + test.get(three));
		

		test.put(four, 4);
		System.out.println(test.get(two) + " " + test.get(four));
	}
}
