package com.homework.java;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Teacher extends Person implements Serializable {

	private static final long serialVersionUID = -7006522180717408099L;
	private double salary;
	private String schoolName;

	public Teacher() {

	}

	public Teacher(String name, int age, double salary, String schoolName) {
		super(name, age);
		this.salary = salary;
		this.schoolName = schoolName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	private void writeObject(ObjectOutputStream outputStream) throws IOException {

		outputStream.defaultWriteObject();
		outputStream.writeInt(getAge());
		outputStream.writeObject(getName());
	}

	private void readObject(ObjectInputStream inputStream) throws ClassNotFoundException, IOException {

		inputStream.defaultReadObject();
		setAge(inputStream.readInt());
		setName((String) inputStream.readObject());
	}

	@Override
	public String toString() {
		return String.format("Teacher [salary=%s, schoolName=%s, salary=%s, schoolName=%s]", salary, schoolName,
				getSalary(), getSchoolName());
	}
}
