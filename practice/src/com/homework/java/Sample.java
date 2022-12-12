package com.homework.java;

public class Sample {
	private int a;
	private int b;
	private int c;

	{
		System.out.println("Inside instance initialization block 1:");
		a = 10;
	}

	public Sample() {
		System.out.println("Inside no param constructor");
	}

	{
		System.out.println("Inside instance initialization block 2:");
		b = 20;
	}

	{
		System.out.println("Inside instance initialization block 3:");
		c = 30;
	}

	public static void main(String[] args) {
		Sample sample = new Sample();
		System.out.println(sample);
	}

	@Override
	public String toString() {
		return String.format("Sample [a=%s, b=%s, c=%s]", a, b, c);
	}

}
