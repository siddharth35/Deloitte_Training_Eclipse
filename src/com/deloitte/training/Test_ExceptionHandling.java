package com.deloitte.training;

import java.io.IOException;

public class Test_ExceptionHandling {

	public static void main(String[] args) throws IOException {
		testTryCatch();
	}

	private static void testTryCatch() throws IOException {
		try {
			String s = Utility.read("Enter Message:");
			int a = 5, b = 0, c = a / b;
			System.out.println("Result=" + c);
			System.out.println("Entered Message: " + s);
		} catch (ArithmeticException ae) {
			System.out.println("Denominator cannot be Zero");
		}
		System.out.println("Execution Complete");
	}
}
