package com.interviewPrblms;

public class BubbleSort {
	
	static void sort(int[] arr) {
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {9,8,7,5,4,3,2,1};
		sort(arr);
		for(int value :arr)
		System.out.print(value+" ");
		

	}

}
