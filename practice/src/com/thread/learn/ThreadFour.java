package com.thread.learn;

public class ThreadFour implements Runnable {

	@Override
	public void run() {
		try {
			System.out.println("Thread Four Run : ");
			Thread.sleep(Short.MAX_VALUE);
		} catch (InterruptedException e) {
			System.err.println(Thread.currentThread().getName() + " is interrupted.");
		}
		for (; !Thread.interrupted();) {
			
		}
		System.out.println("Interrupted Second Time : ");
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadFour four = new ThreadFour();
		Thread thread = new Thread(four, "Thread Four : ");
		thread.start();
		System.out.println(Thread.currentThread().getName() + " is sleeping. ");
		Thread.sleep(1000);

		thread.interrupt();
		System.out.println(Thread.currentThread().getName() + " is sleeping. ");
		Thread.sleep(1000);
		thread.interrupt();
	}
}
