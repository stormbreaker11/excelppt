package com.app.exceltoppt.ds;

public class Perimeter {

	public static int findPerimeter(int length, int width) {
		int sides = length + width;
		return 2 * sides;
	}

	public static void main(String[] args) {
		System.out.println(findPerimeter(20, 10));
	}
}
