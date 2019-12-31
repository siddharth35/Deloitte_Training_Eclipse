package com.deloitte.training;

import java.util.Scanner;

public class CodingAssignment {
	private static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter a Number: ");
		System.out.println("Sum of Odd Digits: " + sumOfOddDigits(SC.nextInt()));
	}

	public static int sumOfOddDigits(int number) {
		int sum = 0;
		while (number > 0) {
			int ldig = number % 10;
			sum += (ldig) % 2 != 0 ? ldig : 0;
			number = number / 10;
		}
		return sum;
	}
}
