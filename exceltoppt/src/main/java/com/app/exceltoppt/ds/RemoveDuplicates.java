package com.app.exceltoppt.ds;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr= {1,2,7,2,2,1};
		removeDuplicates(arr);
	}

	
	private static void removeDuplicates(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]==arr[j++]) {
					int temp=arr[j++];
					arr[j++]=arr[j];
					arr[j]=arr[i];
				}
			}
		}
	}
}
