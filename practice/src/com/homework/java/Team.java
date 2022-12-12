package com.homework.java;

import java.time.LocalDateTime;

public class Team {
	private String name;
	private String captain;
	private LocalDateTime teamCreation;

	public Team(String name, String captain, LocalDateTime teamCreation) {
		this.name = name;
		this.captain = captain;
		this.teamCreation = teamCreation;
	}

	public Team(Team team) {
		this.name = team.name;
		this.captain = team.captain;
		this.teamCreation = team.teamCreation;
	}

	@Override
	public String toString() {
		return String.format("Team [name=%s, captain=%s, teamCreation=%s]", name, captain, teamCreation);
	}

	public static void main(String[] args) {
		Team team1 = new Team("Argentina", "Lionel Messi", LocalDateTime.of(1950, 10, 23, 10, 10));
		Team team2 = new Team(team1);
		System.out.println(team1);
		System.out.println(team2);
	}
}
