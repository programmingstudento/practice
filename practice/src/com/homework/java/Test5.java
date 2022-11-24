package com.homework.java;

public class Test5 {

	public static void main(String[] args) {
		TheRunnable runnable = new TheRunnable();
		Thread thread1 = new Thread(runnable, "One");
		Thread thread2 = new Thread(runnable, "Two");
		thread1.start();
		thread2.start();
	}
}
