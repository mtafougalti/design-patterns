package com.mt.dp.strategy;

/**
 * Context of Strategy
 * @author mtafo
 *
 */
public class Calculator {
	
	private OperationEnum operationEnum;

	public void setOperation( OperationEnum operationEnum) {
		this.operationEnum = operationEnum;
	}
	
	public String calculate(double a, double b) {
		if(operationEnum == null) {
			System.err.println("No Operation is specified ! ");
			return null;
		}
		Operation operation = null;
		try {
			operation = (Operation) operationEnum.getClazz().newInstance();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} 
		double result = operation.calculate(a, b);
		return "The result is : " + result;
	}

}
