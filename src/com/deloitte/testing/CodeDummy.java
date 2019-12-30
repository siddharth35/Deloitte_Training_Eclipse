package com.deloitte.testing;

public class CodeDummy {
	public static void main(String[] args) {
		
	}

	/* Currency Converter */
	public static void currencyConverter() {
		boolean run = true;
		while (run) {
			menu();
			String k = new String(Utility.read("Enter Option:"));
			switch (k) {
			case "1":
				usdToInr(Utility.read("Enter Currency in USD: "));
				break;
			case "2":
				inrToUsd(Utility.read("Enter Currency in INR: "));
				break;
			case "0":
				System.out.println("Thank you");
				run = false;
				break;
			default:
				System.out.println("Invalid Choice");
			}
		}
	}

	private static void menu() {
		System.out.println("1:INR-USD\n2:USD-INR\n0:EXIT");
	}

	private static void usdToInr(String k) {
		try {
			System.out.printf("\n\n%s USD = %.2f INR\n\n", k, Double.parseDouble(k) * 71.205);
		} catch (NumberFormatException nfe) {
			System.out.println("Not a Valid Number");
		}
	}

	private static void inrToUsd(String k) {
		try {
			System.out.printf("\n\n%s INR = %.2f USD\n\n", k, Double.parseDouble(k) / 71.205);
		} catch (NumberFormatException nfe) {
			System.out.println("Not a Valid Number");
		}
	}

	/* Series */
	public static void series(int n) {
		String out = "";
		for (int i = 1; i <= n; i++) {
			out = i % 2 + " " + out;
			System.out.println(out + "\n");
		}
	}

	
	
}
