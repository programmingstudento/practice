package com.thread.learn;

public class ThreadSix implements Runnable {
	private static int counter = 0;

	public static void main(String[] args) throws InterruptedException {
		Thread[] threads = new Thread[5];
		for (int index = 0; index < 5; index++) {
			threads[index] = new Thread(new ThreadSix(), "Thread : " + index);
			threads[index].start();
		}

		for (int index = 0; index < 5; index++) {
			threads[index].join();
		}
	}

	@Override
	public void run() {

		for (; counter < 10;) {
			synchronized (ThreadSix.class) {
				System.out.println(Thread.currentThread().getName() + " before : " + counter);
				counter++;
				System.out.println(Thread.currentThread().getName() + " after : " + counter);
			}
		}
	}

}
