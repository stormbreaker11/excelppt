package com.app.exceltoppt.ds;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		boolean check = isAnagram("Palm", "lmmp");
		if (check)
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");

	}

	private static boolean isAnagram(String string, String string2) {

		char[] charArray = string.toLowerCase().toCharArray();
		char[] charArray2 = string2.toLowerCase().toCharArray();
		Arrays.sort(charArray);
		Arrays.sort(charArray2);

		boolean equals = Arrays.equals(charArray, charArray2);
		if (equals) {
			return true;
		}
		return false;
	}
}
