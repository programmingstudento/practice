package com.repsonsibility.single;

public class Test {
	public static void main(String[] args) {
		Employee one = new Employee(new EmployeeIdCreator().employeeIdCreator(), "Rama", "Singh", 5),
				two = new Employee(new EmployeeIdCreator().employeeIdCreator(), "Sheetal", "Bisht", 3);
		System.out.println(one);
		System.out.println(Seniority.seniorityChecker(one.getYearsWorking()));
		System.out.println(two);
		System.out.println(Seniority.seniorityChecker(two.getYearsWorking()));
	}
}
