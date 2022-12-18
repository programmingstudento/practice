package com.collections.learn;

import java.util.Arrays;
import java.util.Comparator;

public class SortCityByLength {

	public static void main(String[] args) {
		String[] places = { "Biratnagar", "Palpa", "Butwal", "Surkhet", "Mugling" };
		System.out.println(Arrays.toString(places));
		Arrays.sort(places, new LengthComparator());
		System.out.println(Arrays.toString(places));

	}

	public static class LengthComparator implements Comparator<String> {

		@Override
		public int compare(String o1, String o2) {
			return Integer.compare(o1.length(), o2.length());
		}
	}
}
