package com.repsonsibility.single;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int yearsWorking;
}
