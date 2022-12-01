package com.homework.java;

/*
 *A program to generate a simple calculator using static methods.
 */
public final class Calculator {
	public static int add(int number1, int number2) {
		return number1 + number2;
	}

	public static int subtract(int number1, int number2) {
		return number1 - number2;
	}

	public static int multiply(int number1, int number2) {
		return number1 * number2;
	}

	public static double divide(int number1, int number2) {
		return number1 / (number2 * 1d);
	}

	public static void main(String[] args) {
		int[] number1 = { 2, 4, 6, 8 }, number2 = { 1, 2, 3, 4 };
		for (int index = 0, size = number1.length; index < size; index++) {
			System.out.println("Add: " + add(number1[index], number2[index]));
			System.out.println("Subtract: " + subtract(number1[index], number2[index]));
			System.out.println("Multiply: " + multiply(number1[index], number2[index]));
			System.out.println("Divide: " + divide(number1[index], number2[index]));
		}
	}
}
