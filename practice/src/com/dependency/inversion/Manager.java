package com.dependency.inversion;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Manager {
	private Player player;
	private String firstName;
	private int age;

	public void manage() {
		player.play();
		System.out.println("Managing");
	}
}
