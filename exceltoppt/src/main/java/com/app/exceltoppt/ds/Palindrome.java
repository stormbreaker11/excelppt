package com.app.exceltoppt.ds;

public class Palindrome {

	public static int reverse(int n) {
		int res=0;
		while(n>0) {
			int remainder=n%10;
			res=res*10+remainder;
			n=n/10;
		}
		return res;
	}
	
	public static void main(String[] args) {
		int n=140;
		int reverse = reverse(n);
		System.out.println(n==reverse);
	}
}
