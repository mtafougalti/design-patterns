package com.mt.dp.strategy;

public enum OperationEnum {
	
	ADDITION(Addition.class),
	SUBSTRACTION(Substraction.class),
	MULTIPLICATION(Multiplication.class),
	DIVISION(Division.class);
	
	private Class<? extends Object> clazz;

	private OperationEnum(Class<? extends Object> clazz) {
		this.clazz = clazz;
	}

	public Class<? extends Object> getClazz() {
		return clazz;
	}
	
}
