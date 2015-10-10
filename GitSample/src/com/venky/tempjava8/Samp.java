package com.venky.tempjava8;

import java.util.Arrays;

public class Samp {

	public Samp() {

	}

	public static void main(String[] args) {
		int arr[] = { 3, 1, 3, 2, 4, 1 };

		int length = arr.length;
		int count = 0;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (arr[i] == arr[j]) {
					int temp = arr[j];
					count++;
					length--;
					for (int k = j; k < length; k++) {
						arr[k] = arr[k + 1];
					}
					arr[length] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0,
				arr.length - count)));
	}
}
