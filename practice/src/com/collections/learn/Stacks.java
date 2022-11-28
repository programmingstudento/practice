package com.collections.learn;

import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
		Stack<String> sports = new Stack<>();
		sports.push("Football");
		sports.push("Cricket");
		sports.push("Basketball");
		sports.push("Table Tennis");

		for (var sport : sports) {
			System.out.println(sport);
		}

		System.out.println(sports.search("Table Tennis"));
		System.out.println(sports.search("Football"));

		while (sports.size() > 0) {
			System.out.println(sports.pop());
		}

		System.out.println(sports.isEmpty());
	}
}
