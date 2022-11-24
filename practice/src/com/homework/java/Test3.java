package com.homework.java;

public class Test3 {

	public static void main(String[] args) {
		Runnable runnable = () -> {
			System.out.println("Thread Running");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread Completed");
		};

		Thread thread = new Thread(runnable);
		thread.start();
	}

}
