package com.codingdojo.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		c.setOperandOne(2.2);
		c.setOperation("+");
		c.setOperandTwo(1.1);
		c.performOperation();
		System.out.println(c.getResults());

	}

}
