package com.repsonsibility.single;

import java.util.Random;

public class EmployeeIdCreator {
	private int id;

	public int employeeIdCreator() {
		Random random = new Random();
		id = random.nextInt(1, 1_000_000);
		return id;
	}
}
