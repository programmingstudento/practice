package com.homework.java;

/*
 * A program to display the use of this keyword.
 */
public class Student {

	private int id;
	private String name;
	private int age;
	private String country;

	public Student() {

	}

	public Student(int id, String name, int age, String country) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public static void main(String[] args) {
		System.out.println(new Student().hashCode());
	}

}
