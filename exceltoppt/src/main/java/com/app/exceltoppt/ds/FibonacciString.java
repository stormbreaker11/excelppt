package com.app.exceltoppt.ds;

public class FibonacciString {
	public static void main(String[] args) {
		String[] arr = new String[] { "A", "B" };
		String s = generate(6, arr);
		System.out.println(s);
	}

	public static String generate(int n, String[] s) {
		if (n == 2) {
			return "invalid";
		}
		String[] result = new String[n];
		for (int i = 0; i < s.length; i++) {
			result[i] = s[i];
		}
		for (int j = 2; j < n; j++) {
			result[j] = result[j - 1] + result[j - 2];
		}
		String s1 = "";
		for (int i = 0; i < result.length; i++) {
			if (i == result.length - 1) {
				s1 += result[i];
			} else {
				s1 += result[i];
				s1 += ", ";
			}
		}
		return s1;
	}
}
