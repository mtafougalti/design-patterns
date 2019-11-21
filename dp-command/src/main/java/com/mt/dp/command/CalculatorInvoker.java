package com.mt.dp.command;

public class CalculatorInvoker {
	
	private CalculatorCommand command;
	
	public double calculate(double a, double b) {
		return command.doOperation(a, b);
	}

	public void setCommand(CalculatorCommand command) {
		this.command = command;
	}
	
}
