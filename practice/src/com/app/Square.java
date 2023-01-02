package com.app;

public class Square implements IShape {
	private double side;

	public Square(double side) {
		this.side = side;
	}

	@Override
	public void display() {
		System.out.println("Square");
	}

	@Override
	public double area() {
		return side * side;
	}

}
