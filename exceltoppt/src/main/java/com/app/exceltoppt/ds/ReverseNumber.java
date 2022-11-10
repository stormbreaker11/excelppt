package com.app.exceltoppt.ds;

public class ReverseNumber {

	public static void main(String[] args) {
		int n=143;
		String res="";
		while(n>0) {
			int remainder=n%10;
			res=res+remainder;
			n=n/10;
		}
		System.out.println(res);
	}
}
