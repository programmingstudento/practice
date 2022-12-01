package com.homework.java;

public interface Area {
	final static double PI = 3.1415;

	double compute();

	void display();

	public static void main(String[] args) {
		new Circle(10).display();
	}
}

class Circle implements Area {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double compute() {
		return PI * radius * radius;
	}

	@Override
	public void display() {
		System.out.printf("Area of circle : %.2f", compute());
	}

}