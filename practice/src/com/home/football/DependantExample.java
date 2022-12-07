package com.home.football;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DependantExample {
	private LocalDate date;

	public DependantExample(LocalDate date) {
		this.date = date;
	}

	public String oracleDatabaseDefaultDate() {
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MMM-yy");
		return dateFormat.format(date).toUpperCase();
	}

	public static void main(String[] args) {
		DependantExample dependantExample = new DependantExample(LocalDate.now());
		System.out.println(dependantExample.oracleDatabaseDefaultDate());
	}
}
