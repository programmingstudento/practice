package com.homework.java;

public class Test1 {

	class AThread extends Thread {
		@Override
		public void run() {
			System.out.println("A thread is running.");
			System.out.println("A thread is finished.");
		}
	}

	public static void main(String[] args) {
		Test1 test1 = new Test1();
		Test1.AThread thread = test1.new AThread();
		thread.start();
	}

}
