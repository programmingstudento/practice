package com.home.football;

public class Parent {
	public static void method1() {
		System.out.println("Parent static method");
	}

	public void method2() {
		System.out.println("Instance method");
	}

}

class Child extends Parent {
	public static void method1() {
		System.out.println("Child static method");
	}

	public void method2() {
		System.out.println("Instance method");
	}

}