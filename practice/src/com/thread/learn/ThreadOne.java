package com.thread.learn;

import java.lang.Thread.State;

public class ThreadOne {

	public static void main(String[] args) {
		int id = (int) Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		ThreadGroup group = Thread.currentThread().getThreadGroup();
		State state = Thread.currentThread().getState();
		int priority = Thread.currentThread().getPriority();
		System.out.printf("Id: %d Name : %s Group: %s State : %s Priority : %d%n",
				new Object[] { id, name, group, state, priority });
	}

}
