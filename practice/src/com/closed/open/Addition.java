package com.closed.open;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Addition implements ArithmeticOperation {

	private int operand1;
	private int operand2;
	private int result;

	public void operation() {
		result = operand1 + operand2;
	}

	public Addition(int operand1, int operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}

}
