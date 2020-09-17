package com.training.ds.sort;

public class MergeSort {

	
	public static void main(String[] args) {
		int arr[] = {6, 5, 2, 8, 4, 10, 23, 7};
		
		mergeSort(arr, 0, arr.length -1 ); 
		
		System.out.println("Sorted Array... ");
		printArray(arr); 
	}

	private static void printArray(int[] arr) {

		for(int i=0; i<arr.length; i++) {
			System.out.print("\t" + arr[i]);
		}
		System.out.println();
	}

	private static void mergeSort(int[] arr, int low, int high) {

		if(low < high) {
			int mid = (low + high) /2 ; 
			
			mergeSort(arr, low, mid); 
			mergeSort(arr, mid +1, high);
			
			merge(arr, low, mid, high); 
		}
	}

	private static void merge(int[] arr, int low, int mid, int high) {
		int n1 = mid - low+1; 
		int n2 = high - mid; 
		
		int [] lowerArr = new int[n1]; 
		int [] rightArr = new int[n2]; 
		
		
		// copy the elements of arr into right array (lowerArry, rightArr) 
		
		for(int i=0; i<n1; i++) {
			lowerArr[i] = arr[low + i]; 
		}
		
		for(int i=0; i<n2; i++) {
			rightArr [i]= arr[mid + 1+ i]; 
		}
		
		// index of sub array/s 
		int i =0; 
		int j=0; 
		int k = low; 
		
		// pick the smaller elements from each of the array and 
		// replace the position of arr with index k 
		while(i < n1 && j < n2) {
			if(lowerArr[i] < rightArr[j]) {
				arr[k] = lowerArr[i]; 
				i++; 
			}else  {
				arr[k] = rightArr[j]; 
				j ++; 
			}
			
			k++; 
		}
		
		
		// if the elements of one of the array (child) is running out 
		// then copy rest of the elements 
		
		while(i<n1) {
			arr[k] = lowerArr[i]; 
			i++; 
			k++; 
		}
		
		while(j<n2) {
			arr[k] = rightArr[j]; 
			j++; 
			k++; 
		}
	}
}





















