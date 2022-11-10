package com.app.exceltoppt.ds;

public class Factorial {

	private static int printFactorial(int n) {
		int f = 1;
		for (int i = 1; i <= n; i++) {
			f = f * i;
		}
		return f;
	}
	public static void main(String[] args) {
		int f = printFactorial(5);
		System.out.println(f);
	}
}
