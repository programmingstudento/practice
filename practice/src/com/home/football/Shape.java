package com.home.football;

public abstract class Shape implements Comparable<Shape> {
	public abstract double area();

	@Override
	public int compareTo(Shape o) {
		return Double.compare(area(), o.area());
	}
}

class Square extends Shape {
	private double side;

	public Square(double side) {
		super();
		this.side = side;
	}

	@Override
	public double area() {
		return side * side;
	}

}

class Triangle extends Shape {
	private double base;
	private double height;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double area() {
		return base * height * .5;
	}

}

class Rectangle extends Shape {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double area() {
		return width * height;
	}

}

class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return radius * radius * Math.PI;
	}

}

class CustomShape extends Shape {
	private double area;

	public CustomShape(double area) {
		this.area = area;
	}

	@Override
	public double area() {
		return area;
	}
}
