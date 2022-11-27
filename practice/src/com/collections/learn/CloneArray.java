package com.collections.learn;

import java.util.Arrays;

public class CloneArray {
	public static void main(String[] args) {
		var number1 = new int[] { 11, 22, 33, 44, 55, 66 };
		var number2 = number1.clone();
		var number3 = new int[] { 111, 222, 333, 444, 555, 666 };

		number3[0] = 1111;
		System.out.println(number1.hashCode() + " " + Arrays.toString(number1));
		System.out.println(number2.hashCode() + " " + Arrays.toString(number2));
		System.out.println(Arrays.toString(number3));

		var number4 = new int[][] { number1, number2, number3 };
		var number5 = number4.clone(); // shallow clone
		System.out.println(number4.hashCode() + " " + Arrays.deepToString(number4));
		number5[0][1] = 222;
		number5[1][1] = 222;
		number5[2][1] = 2222;

		System.out.println(Arrays.deepToString(number4));
		System.out.println(Arrays.deepToString(number5));
		System.out.println(Arrays.toString(number1));
		System.out.println(Arrays.toString(number2));
		System.out.println(Arrays.toString(number3));
	}
}
