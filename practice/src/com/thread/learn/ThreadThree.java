package com.thread.learn;

public class ThreadThree implements Runnable {

	public static void main(String[] args) {
		Thread thread = new Thread(new ThreadThree(), "Thread Three");
		thread.start();
		System.out.println(Thread.currentThread().getName());
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
