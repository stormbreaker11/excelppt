package com.app.exceltoppt.ds;

public class ArmstrongString {

	public static void main(String[] args) {
		boolean flag = armStrong(150);
	}

	private static boolean armStrong(int i) {

		int res = 0, count = 0;
		while (i > 0) {
			i = i / 10;
			count++;
		}
		while (i > 0) {
			int remainder = i % 10;
			int p = power(remainder, count);
			res += p;
			i = i / 10;
		}

		System.out.println(i == res);
		return false;
	}

	private static int power(int remainder, int count) {
		int res = 1;
		while (count > 0) {
			res = res * remainder;
			count--;
		}
		return res;
	}
}
