package com.mt.dp.strategy;

public class Application {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		double a = 10; double b = 5;
		
		// ADDITION
		calculator.setOperation(OperationEnum.ADDITION);
		System.out.println(OperationEnum.ADDITION + "       : " + calculator.calculate(a, b));

		// SUBSTRACTION
		calculator.setOperation(OperationEnum.SUBSTRACTION);
		System.out.println(OperationEnum.SUBSTRACTION + "   : " + calculator.calculate(a, b));

		// MULTIPLICATION
		calculator.setOperation(OperationEnum.MULTIPLICATION);
		System.out.println(OperationEnum.MULTIPLICATION + " : " + calculator.calculate(a, b));

		// DIVISION
		calculator.setOperation(OperationEnum.DIVISION);
		System.out.println(OperationEnum.DIVISION + "       : " + calculator.calculate(a, b));

	}

}
