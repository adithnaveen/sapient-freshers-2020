package com.training.ds.sort;

public class BubbleSort {

	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp;

		for (int i = 0; i < n; i++) {// n 
			for (int j = 0; j < n - i - 1; j++) {// n 
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		System.out.println("Sorted Array : ");
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 45, 22, 33, 55, 12, 65 };

		bubbleSort(arr);

	}
}
