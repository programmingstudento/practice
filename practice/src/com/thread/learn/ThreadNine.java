package com.thread.learn;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadNine {

	public static void main(String[] args) {
		Counter counter = new Counter();
		System.out.println(counter.getAtomicInteger().intValue());
		Runnable[] runnables = { () -> {
			counter.increment();
			System.out.println(Thread.currentThread().getName());
		}, () -> {
			counter.increment();
			System.out.println(Thread.currentThread().getName());
		}, () -> {
			counter.increment();
			System.out.println(Thread.currentThread().getName());
		}, () -> {
			counter.increment();
			System.out.println(Thread.currentThread().getName());
		} };
		ExecutorService executor = Executors.newFixedThreadPool(2);
		for (Runnable runnable : runnables) {
			executor.submit(runnable);
		}
		try {
			executor.awaitTermination(3, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(counter.getAtomicInteger().intValue());
		executor.shutdown();
	}
}

class Counter {
	private AtomicInteger atomicInteger;

	public Counter() {
		atomicInteger = new AtomicInteger(1);
	}

	public AtomicInteger getAtomicInteger() {
		return atomicInteger;
	}

	public void increment() {
		atomicInteger.incrementAndGet();
	}
}