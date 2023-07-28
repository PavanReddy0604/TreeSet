package com.interviewPrblms;

import java.util.Arrays;

public class RotateArrayRightByNPlaces {
	
	 public static int[] rotate(int[] nums, int k) {

	        if(k>nums.length)
	        k=k%nums.length;

	        reverseArray(nums,nums.length-k,nums.length-1);
	        reverseArray(nums,0,(nums.length-k)-1);
	        reverseArray(nums,0,nums.length-1);
	        return nums;
	    }


	    static void reverseArray(int[] arr,int start,int end){

	        while(start<=end){
	            int temp=arr[start];
	            arr[start]=arr[end];
	            arr[end]=temp;
	            start++;
	            end--;
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8};
		int[] rotate = rotate(arr, 3);
		System.out.println(Arrays.toString(rotate));
		

	}

}
