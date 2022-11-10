package com.app.exceltoppt.ds;

public class SumNumbers {

	public static void main(String[] args) {
		int n = 123;

		int sum = 0;

		while (n > 0) {
			int remainder = n % 10;
			sum = sum + remainder;
			n = n / 10;
		}
		System.out.println(sum);
	}

}
