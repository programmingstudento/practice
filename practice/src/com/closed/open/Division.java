package com.closed.open;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Division implements ArithmeticOperation {
	private int operand1;
	private int operand2;
	private int result;

	public Division(int operand1, int operand2) {
		this.operand1 = operand1;
		this.operand2 = operand2;
	}

	public void operation() {
		if (operand2 != 0)
			result = operand1 / operand2;
	}

}