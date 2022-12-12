package com.homework.java;

public class College {
	private String name;
	private int yearEstablished;
	private int numberOfEmployees;
	private int busNumber;

	public College(String name, int yearEstablished, int numberOfEmployees, int busNumber) {
		super();
		this.name = name; // variable shadowing name = name. solution : this.name = name;
		this.yearEstablished = yearEstablished;
		this.numberOfEmployees = numberOfEmployees;
		this.busNumber = busNumber;
	}

	public College() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearEstablished() {
		return yearEstablished;
	}

	public void setYearEstablished(int yearEstablished) {
		this.yearEstablished = yearEstablished;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}

}
