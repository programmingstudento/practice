package com.homework.java;

public class Test4 {
	public static void main(String[] args) {
		Runnable runnable = () -> {
			while (true) {
				System.out.println("Running");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		};

		Thread thread = new Thread(runnable);
		thread.setDaemon(true);
		thread.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
