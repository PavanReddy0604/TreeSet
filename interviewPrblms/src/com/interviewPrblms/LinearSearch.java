package com.interviewPrblms;

public class LinearSearch {
	
	static int search(int[] arr,int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}

	//TC--> O(N)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {9,8,7,5,4,3,2,1};
		System.out.println(search(arr,5));

	}

}
