package com.prototype;

public class Test {

	public static void main(String[] args) {
		Fruit one = new Fruit("Orange", "Orange", 180.50);
		Fruit two = one.getClone();
		one.setPrice(110.50);

		System.out.println(one);
		System.out.println(two);
	}
}
