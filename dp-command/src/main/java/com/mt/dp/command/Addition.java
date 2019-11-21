package com.mt.dp.command;

public class Addition implements CalculatorCommand {

	private CalculatorReceiver receiver;
	
	public Addition(CalculatorReceiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public double doOperation(double a, double b) {
		return receiver.add(a, b);
	}

}
