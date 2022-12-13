package com.home.football;

public class AdditionTest {

	public static void main(String[] args) {
		System.out.println("Method Overloading example");
		System.out.println(Addition.add(5.5, 4.5));
		System.out.println(Addition.add(4, 6));
		System.out.println(Addition.add("TE", "N"));

		System.out.println("Method hiding example:");
		Parent parent = new Child();
		parent.method2();
		Parent.method1();
		Child.method1();

	}

}
