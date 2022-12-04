package com.thread.learn;

public class ThreadTwo extends Thread {

	public ThreadTwo(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println("Name : " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		ThreadTwo threadTwo = new ThreadTwo("Thread 2 : ");
		threadTwo.start();
	}
}
