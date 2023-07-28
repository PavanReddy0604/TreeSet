package com.interviewPrblms;

public class FindMissingNumber {
	
	
	static void sumOfN(int[] arr) {
		
		int sum =0;
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("minimum is " + min);
		
		int n=arr.length+1;
	int totalNumSum=((max*(max+1)))/2;
		int actualSum=(((min-1)*(min)))/2;
		
		System.out.println("total sum is" +totalNumSum);
		System.out.println("actual sum is "+actualSum);
		int sum2=totalNumSum-actualSum;
		System.out.println("sum 2 is "+sum2);
		
		System.out.println("missing number is "+(sum2-sum));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,4,6,5,8};
		sumOfN(arr);

	}

}
