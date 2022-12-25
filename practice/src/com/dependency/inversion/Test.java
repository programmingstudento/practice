package com.dependency.inversion;

public class Test {

	public static void main(String[] args) {
		Player player = new FootballPlayer();
		Manager manager = new Manager(player, "Messi", 35);
		manager.manage();
	}
}

class FootballPlayer implements Player {

	@Override
	public void play() {
		System.out.println("Football player.");
	}
}

class BasketballPlayer implements Player {

	@Override
	public void play() {
		System.out.println("Basketball player.");

	}

}