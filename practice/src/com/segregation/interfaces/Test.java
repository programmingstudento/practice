package com.segregation.interfaces;

public class Test {

	public static void main(String[] args) {
		Swimmer swimmer = new SwimmingAthelete();
		Runner runner = new RunningAthelete();
		swimmer.swim();
		runner.run();
	}

}
