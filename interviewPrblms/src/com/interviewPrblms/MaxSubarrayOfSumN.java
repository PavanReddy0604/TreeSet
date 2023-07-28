package com.interviewPrblms;

public class MaxSubarrayOfSumN {
	
	static int MaxSubArrayOfSumN(int[] arr,int N) {
		int len=arr.length;
		
		int maxLength=0;
		for(int i=0;i<len;i++) {
			for(int j=i;j<len;j++) {
				int sum=0;
				for(int k=i;k<=j;k++) {
					sum+=arr[k];
				}
				if(sum==N) {
					maxLength=Math.max(maxLength, j-i+1);
				}
			}
		}
		return maxLength;
	}
	
	//Optimal
	static int MaxSubArrayOfSumN2(int[] arr,int N) {
		int len=arr.length;
		
		int maxLength=0;
		for(int i=0;i<len;i++) {
			int sum=0;
			for(int j=i;j<len;j++) {
			
				
					sum+=arr[j];
				if(sum==N) {
					maxLength=Math.max(maxLength, j-i+1);
				}
			}
		}
		return maxLength;
	}

	public static void main(String[] args) {
		int arr[]= {2,1,3,4,5,1,1,1,7,2,1};
		int maxSubArrayOfSumN = MaxSubArrayOfSumN(arr,10);
		System.out.println(maxSubArrayOfSumN);
		int maxSubArrayOfSumN2 = MaxSubArrayOfSumN2(arr,10);
		System.out.println(maxSubArrayOfSumN2);
		
		
	}

}
