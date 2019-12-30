package com.deloitte.training;

public class Calculate_LambdaExpression {
	public static void main(String[] args) {
		Calculation c = new Calculation();
		c.calculate(0, 0, (a, b) -> (a + b));
		c.calculate(0, 0, (a, b) -> {
			System.out.println(a - b);
			return a - b;
		});
		c.calculate(0, 0, (a, b) -> (a * b));
		c.calculate(0, 0, (a, b) -> (a / b));
		c.calculate(0, 0, (a, b) -> Math.pow(a, b));
	}
}

interface Operation {
	double operate(double a, double b);
}

class Calculation {
	double calculate(double a, double b, Operation op) {
		return op.operate(a, b);
	}
}