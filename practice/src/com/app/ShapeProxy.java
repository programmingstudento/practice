package com.app;

public class ShapeProxy implements IShape {

	private IShape shape;

	public ShapeProxy(IShape shape) {
		this.shape = shape;
	}

	@Override
	public void display() {
		shape.display();
	}

	@Override
	public double area() {
		return shape.area();
	}

}
