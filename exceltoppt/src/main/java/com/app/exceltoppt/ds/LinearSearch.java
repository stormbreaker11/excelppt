package com.app.exceltoppt.ds;

import java.util.Scanner;

public class LinearSearch {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int counter = 0, array[];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Size of an array >>>>>>");
		int size = scanner.nextInt();
		array = new int[size];
		System.out.println("Enter Elements in an array >>>>>>");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println("Enter number to find it s position >>>>>>");
		int find = scanner.nextInt();
		for (int i = 0; i < size; i++) {
			counter++;
			if (array[i] == find) {
				System.out.println(find + " Found at postion " + i);
				break;
			}
		}
		if (size == counter) {
			System.out.println("Cannot find the position");
		}

	}
}
