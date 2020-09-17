package com.training.ds.sort;

import java.util.Arrays;

public class QuickSort {

	private static int  partition (int arr[], int low, int high) {
		int pivot = arr[high]; 
		int i = (low-1); 
		
		for(int j=low; j < high ; j++) {
			if(arr[j] <=pivot) {
				i++;
				int temp = arr[i]; 
				arr[i] = arr[j]; 
				arr[j] = temp; 
			}
		}
		
		int t = arr[i+1]; 
		arr[i+1] = arr[high]; 
		arr[high] = t; 
		return (i+1); 
		
	}
	private static void quickSort (int arr[], int low, int high) {
		if(low < high) {
			int pivot = partition(arr, low, high); 
			
			quickSort(arr, low, pivot-1);
			quickSort(arr, pivot+1, high);
		}
	}
	
	public static void main(String[] args) {
		int [] data = {10, 8, 12, 43, 33, 89, 31};
		
		int size = data.length; 
		
		System.out.println(size);
		quickSort(data, 0, size-1); 
		
		System.out.println("Sorted List ");
		System.out.println(Arrays.toString(data));
		
	}
}
