package com.mt.dp.command;

public class Application {
	public static void main(String[] args) {
		CalculatorReceiver receiver = new CalculatorReceiver();
		CalculatorInvoker invoker = new CalculatorInvoker();
		
		//Addition
		invoker.setCommand(new Addition(receiver));
		System.out.println(invoker.calculate(10, 5));
		
		//Substraction
		invoker.setCommand(new Substraction(receiver));
		System.out.println(invoker.calculate(10, 5));
	}
}
