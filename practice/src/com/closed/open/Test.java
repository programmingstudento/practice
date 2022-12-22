package com.closed.open;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		ArithmeticOperation[] arithmeticOperations = { new Addition(10, 10), new Division(7, 2),
				new Subtraction(20, 22), new Multiplication(2, 4) };
		Arrays.stream(arithmeticOperations).forEach(operation -> {
			System.out.println("Before: " + operation);
			Calculator.calculate(operation);
			System.out.println("After: " + operation);
			System.out.println();
		});
	}
}
