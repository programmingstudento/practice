package com.thread.learn;

public class ThreadSeven {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getState() + " started.");
		try {
			Thread.currentThread().join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getState() + " ended.");
	}

}
