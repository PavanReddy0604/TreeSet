package com.interviewPrblms;

public class BinarySearch {

	static int search(int[] arr, int key) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
		//	  int mi = end + (start - end) / 2;
			if (arr[mid] == key)
				return mid;
			else if (arr[mid] > key)
				end = mid - 1;
			else
				start = mid + 1;

		}
		return -1;
	}

	// TC --> O(Logn)
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 4, 6, 8, 10 };
		System.out.println(search(arr, 2));

	}

}
