package com.deloitte.training;

public class Test_LambdaExpression {
	public static void main(String[] args) {
		LambdaExpression le = () -> System.out.println("Hello");
		le.show();

		LambdaExpressionArgs lea = (s) -> System.out.println("Welcome, " + s + "!");
		lea.show("Siddharth");

		LambdaExpressionReturn ler = (a, b) -> {
			int res = a + b;
			System.out.println("Sum = " + res);
			return res;
		};
		int sum = ler.show(25, 10);
		System.out.println("Returned Value = " + sum);
	}
}

interface LambdaExpression {
	void show();
}

interface LambdaExpressionArgs {
	void show(String s);
}

interface LambdaExpressionReturn {
	int show(int a, int b);
}