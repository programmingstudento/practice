package com.app;

public class Rectangle implements IShape {
	private double length;
	private double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public void display() {
		System.out.println("Rectangle");
	}

	@Override
	public double area() {
		return 2 * (length + width);
	}

}
