package com.mt.dp.command;

public class Substraction implements CalculatorCommand {
	
	private CalculatorReceiver receiver;

	public Substraction(CalculatorReceiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public double doOperation(double a, double b) {
		return receiver.substract(a, b);
	}

}
