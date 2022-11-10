package com.app.exceltoppt.ds;

import java.util.Arrays;

public class ReverseWord {

	public static void main(String[] args) {
		String[] arr = "House of the Dragon".split(" ");
		String res = "";
		String[] newrr = new String[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			res = reverserWord(arr[i]) + "";
			newrr[i] = res;
		}
		System.out.println(Arrays.toString(newrr));
	}

	private static String reverserWord(String string) {
		String res = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			res = res + string.charAt(i);
		}
		return res;
	}
}

























