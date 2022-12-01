package com.homework.java;

import static java.lang.Integer.toBinaryString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.IntStream;

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

		System.out.println(binaryAddition(5, 9));

		System.out.println(new Test().check("The quick brown fox jumps over the lazy dog."));

	}

	public static String binaryAddition(int a, int b) {
		return toBinaryString(a + b);
	}

	public boolean check(String sentence) {
		Map<String, Integer> count = new HashMap<>();
		String[] items = sentence.toLowerCase().replaceAll("[^a-z]", "").split("");
		for (String item : items) {
			if (count.get(item) == null) {
				count.put(item, 0);
			}
			count.put(item, count.get(item) + 1);
		}
		return count.values().stream().allMatch(number -> number > 0) && count.size() == 26;
	}

	public static boolean isAnagram(String test, String original) {
		List<String> one = Arrays.asList(test.split("")), two = Arrays.asList(original.split(""));
		Collections.sort(one);
		Collections.sort(two);
		return IntStream.range(0, one.size()).allMatch(index -> one.get(index).equals(two.get(index)));
	}

	public static int countArgs(Object... args) {
		return (int) Arrays.asList(args).stream().count();
	}

	public static int mostFrequentItemCount(int[] collection) {
		Map<Integer, Integer> counter = new HashMap<>();
		for (int number : collection) {
			if (Objects.equals(counter.get(number), null)) {
				counter.put(number, 0);
			}
			counter.put(number, counter.get(number) + 1);
		}
		return new ArrayList<>(counter.values()).stream().mapToInt(num -> num).max().getAsInt();

	}
}
