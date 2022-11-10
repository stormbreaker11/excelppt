package com.app.exceltoppt.ds;

public class Powers {

	private static int factorial(int remainder, int count) {
		int res=1;
		while(count>0) {
			res=res*remainder;
			count--;
		}
		return res;
	}
	
	public static void main(String[] args) {
		int factorial = factorial(5,3);
	}
}
