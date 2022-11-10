package com.app.exceltoppt.ds;

public class OneToHudredFibonacci {

	public static void main(String[] args) {

		int b = 1, a = 0;
		System.out.println(a);
		System.out.println(b);
		for (int i = 2; i <= 20; i++) {
			int c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}

	}
}
