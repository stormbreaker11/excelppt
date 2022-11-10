package com.app.exceltoppt.ds;

public class PrimeNumber1to100 {

	public static void main(String[] args) {

		for (int n = 1; n <= 100; n++) {
			int c = 0;
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					c++;
				}
			}
			if (c == 2) {
				System.out.println(n);
			} else {
				continue;
			}

		}

	}

}
