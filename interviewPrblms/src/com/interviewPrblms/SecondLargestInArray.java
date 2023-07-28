package com.interviewPrblms;

import java.util.Arrays;

public class SecondLargestInArray {

	//if duplicate elemets are present
	static int secondLargest(int[] arr) {
		if (arr.length < 2)
			return -1;

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (largest < arr[i]) {
				largest = arr[i];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>secondLargest) {
				if (arr[i] != largest) {
					secondLargest = arr[i];
				}
			}
		}
		return secondLargest;
	}
	
	
	static int secondLargestUnique(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length-2];
	}
	
	static int print2largest(int arr[], int n) {
        int largest=arr[0];
        int secondLargest=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
            	secondLargest=largest;
                largest=arr[i];
            }
             if(arr[i]<largest && arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }
	
	static int print2Smallest(int arr[], int n) {
		
		int smallest=arr[0];
		int secondSmallest=Integer.MAX_VALUE;
		
		for(int i=1;i<n;i++) {
			if(arr[i]<smallest) {
				secondSmallest=smallest;
				smallest=arr[i];
			}
			else if(arr[i]!=smallest && arr[i]<secondSmallest) {
				secondSmallest=arr[i];
			}
		}
		return secondSmallest;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 2,6,45, 32, 54, 78, 34, 98 };
		System.out.println(print2Smallest(arr,arr.length));
		
		int[] uniqueArray= {2,3,4,5,15,16,9};
		System.out.println(secondLargestUnique(uniqueArray));

	}

}
