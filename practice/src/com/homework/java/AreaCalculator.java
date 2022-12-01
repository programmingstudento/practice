package com.homework.java;

/*
 * A program to demonstrate method overloading.
 */
public final class AreaCalculator {
	public static int area(int side) {
		return side * side;
	}

	public static int area(int length, int breadth) {
		return 2 * (length + breadth);
	}

	public static void main(String[] args) {
		System.out.println("Area of Square : " + area(10));
		System.out.println("Area of Rectangle : " + area(25, 25));
	}
}
