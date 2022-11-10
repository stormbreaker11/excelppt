package com.app.exceltoppt.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingArrays {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1, 3, 5);
		int[] arr = missingNumbers(asList);
		System.out.println(Arrays.toString(arr));
	}

	private static int[] missingNumbers(List<Integer> asList) {
		List<Integer> missed = new ArrayList<>();

		int max = asList.get(1);
		int min = asList.get(0);

		for (int i = 0; i < asList.size(); i++) {
			if (asList.get(i) < min) {
				min = asList.get(i);
			}
			if (asList.get(i) > max) {
				max = asList.get(i);
			}
		}

		for (int i = min; i <max; i++) {
			if (!asList.contains(i)) {
				missed.add(i);
			}
		}

		Object[] array = missed.toArray();
		int[] res = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			res[i] = (int) array[i];
		}
		return res;
	}
}
