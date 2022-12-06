package com.thread.learn;

public class ThreadEight {

	public static void main(String[] args) {
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());

			}
		};

		Thread thread1 = new Thread(runnable, "Thread 1");
		thread1.start();
	}
}
