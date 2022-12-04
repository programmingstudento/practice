package com.thread.learn;

import java.util.Random;

public class ThreadFive implements Runnable {
	Random random = new Random();
	@Override
	public void run() {
		
		for (int index = 0; index < 1_000_000; index++) {
			random.nextInt();
		}
		System.out.println(Thread.currentThread().getName() + " finished");
	}

	public static void main(String[] args) throws InterruptedException {
		Thread[] threads = new Thread[6];
		for (int index = 0,size = 6; index < size;index++) {
			threads[index] = new Thread(new ThreadFive(), "Thread : " + index);
			threads[index].start();
		}
		for (Thread thread : threads) {
			thread.join();
		}
		System.out.println("All threads finished");
	}
}
