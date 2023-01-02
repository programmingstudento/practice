package com.app;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ShapeHandler implements InvocationHandler {

	private IShape shape;

	public ShapeHandler(IShape shape) {
		this.shape = shape;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("Method Name : " + method.getName());
		return method.invoke(shape, args);
	}
}
