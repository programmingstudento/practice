package com.homework.java;

public class Test2 {
	class ARunnable implements Runnable {

		@Override
		public void run() {
			System.out.println("ARunnable is running.");
			System.out.println("ARunnable is finished.");

		}

	}

	public static void main(String[] args) {
		Test2 test2 = new Test2();
		Test2.ARunnable runnable = test2.new ARunnable();
		Thread thread = new Thread(runnable);
		thread.start();

		Runnable runnable2 = new Runnable() {

			@Override
			public void run() {
				System.out.println("ARunnable is running." + " " + Thread.currentThread().getName());
				System.out.println("ARunnable is finished." + " " + Thread.currentThread().getName());
			}
		};
		Thread thread2 = new Thread(runnable2, "One");
		Thread thread3 = new Thread(() -> {
			System.out.println("ARunnable is running." + " " + Thread.currentThread().getName());
			System.out.println("ARunnable is finished." + " " + Thread.currentThread().getName());
		}, "Two");
		thread2.start();
		thread3.start();
	}
}
