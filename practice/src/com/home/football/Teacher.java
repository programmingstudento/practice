package com.home.football;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Teacher extends Person implements Externalizable {

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

	@Override
	public String toString() {
		return String.format("Teacher [salary=%s, schoolName=%s, salary=%s, schoolName=%s]", salary, schoolName,
				getSalary(), getSchoolName());
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(getAge());
		out.writeObject(getName());
		out.writeDouble(salary);
		out.writeObject(schoolName);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		setAge(in.readInt());
		setName((String) in.readObject());
		salary = in.readDouble();
		schoolName = (String) in.readObject();
	}
}
