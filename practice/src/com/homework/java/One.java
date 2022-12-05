package com.homework.java;

import static java.lang.Math.sqrt;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class One {

	public static int[] isPerfectPower(int n) {
		int number = -1;
		for (int i = 2, end = (int) Math.sqrt(n); i <= end; i++) {
			number = (int) Math.round(Math.log(n) / Math.log(i));
			if ((int) Math.pow(i, number) == n)
				return new int[] { i, number };

		}

		return null;
	}

	private static Map<String, String> one = Map.of("NORTH", "SOUTH", "EAST", "WEST", "SOUTH", "NORTH", "WEST", "EAST");

	public static void main(String[] args) {

	}

	public static String[] dirReduc(String[] arr) {
		Stack<String> result = new Stack<>();
		for (int index = 0, size = arr.length; index < size; size++) {
			if (result.empty() && result.peek().equals(one.get(arr[index]))) {
				result.pop();
			} else {
				result.push(arr[index]);
			}
		}
		return result.toArray(new String[result.size()]);
	}

	public static String solEquaStr(long n) {
		List<List<Long>> result = new ArrayList<>();
		long num = -1;
		for (long number = 1, end = (long) sqrt(n); number <= end; number++) {
			if (n % number == 0) {
				num = n / number;
				if ((number + num) % 2 == 0 && (num - number) % 4 == 0) {
					result.add(List.of((num + number) / 2, (num - number) / 4));

				}
			}

		}
		return result.toString();
	}

}
