package com.homework.java;

public class Consonants {
	public static int getCount(String words) {
		final String VOWELS = "AEIOUaeiou";
		return (int) words.chars().filter(ch -> Character.isLetter(ch) && VOWELS.indexOf(ch) == -1).count();
	}
}