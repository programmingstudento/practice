package com.app.test;

import static java.lang.System.out;

import com.app.IShape;
import com.app.Rectangle;
import com.app.Square;

public class ClientTest {

	public static void main(String[] args) {
		IShape rectangle = new Rectangle(10d, 8d);
		operations(rectangle);

		IShape square = new Square(10);
		operations(square);
	}

	private static void operations(IShape shape) {
		shape.display();
		out.printf("Area : %.2f%n", shape.area());
	}
}
