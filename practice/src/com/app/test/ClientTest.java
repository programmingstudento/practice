package com.app.test;

import static java.lang.System.out;

import java.lang.reflect.Proxy;

import com.app.IShape;
import com.app.Rectangle;
import com.app.ShapeHandler;
import com.app.ShapeProxy;
import com.app.Square;

public class ClientTest {

	public static void main(String[] args) {
		IShape rectangle = new Rectangle(10d, 8d);
		operations(rectangle);

		IShape square = new Square(10);
		operations(square);

		IShape aRectangle = new ShapeProxy(rectangle);
		operations(aRectangle);

		IShape aSquare = new ShapeProxy(square);
		operations(aSquare);

		ClassLoader loader = IShape.class.getClassLoader();
		IShape theShape = (IShape) Proxy.newProxyInstance(loader, new Class[] { IShape.class },
				new ShapeHandler(new Square(3)));
		operations(theShape);
	}

	private static void operations(IShape shape) {
		shape.display();
		out.printf("Area : %.2f%n", shape.area());
	}
}
