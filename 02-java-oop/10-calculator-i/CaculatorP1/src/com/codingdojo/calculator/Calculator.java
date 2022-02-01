package com.codingdojo.calculator;

public class Calculator {
	// attributes
	private double opOne;
	private String operation;
	private double opTwo;
	private double result;
	//setters
	public void setOperandOne(double num1) {
		this.opOne = num1;
	}
	public void setOperation(String oper) {
		this.operation = oper;
	}
	public void setOperandTwo(double num2) {
		this.opTwo = num2;
	}
	//methods
	public double performOperation() {
		if (this.operation == "+") {
			this.result = this.opOne + this.opTwo;
		}
		else if(this.operation == "-") {
			this.result = this.opOne - this.opTwo;
		}
		else if(this.operation == "*") {
			this.result = this.opOne * this.opTwo;
		}
		else if(this.operation == "/") {
			this.result = this.opOne / this.opTwo;
		}
		else {
			this.result = 0.0;
			System.out.println("Error: no operation given");
		}
		return this.result;
		
	}
	public double getResults() {
		return this.result;
	}
	//
}
