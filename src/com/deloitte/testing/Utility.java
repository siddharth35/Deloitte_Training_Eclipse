package com.deloitte.testing;

import java.io.IOException;

public class Utility {
	private Utility() {
	}

	public static String read(String message) {
		try {
			int k;
			String out = "";
			System.out.print(message);
			do {
				k = System.in.read();
				if (k != 10 && k != 13) {
					out = out + (char) k;
				}
			} while (k != 10);
			return out;
		} catch (IOException e) {
			return "";
		}
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
