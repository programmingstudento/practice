package com.homework.java;

public class TheRunnable implements Runnable {
	private int counter;

	@Override
	public void run() {
//		for (int number = 0; number < 1_001; number++) {
//			counter++;
//		}

		// solution
		synchronized (this) {
			for (int number = 0; number < 1_001; number++) {
				counter++;
			}
		}
		System.out.println("The total is " + counter + " for thread " + Thread.currentThread().getName());
	}
}
