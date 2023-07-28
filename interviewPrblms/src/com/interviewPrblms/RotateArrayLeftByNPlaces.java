package com.interviewPrblms;

import java.util.Arrays;

public class RotateArrayLeftByNPlaces {
	
	static long[] leftRotate(long arr[], int k,int n)
    {
        if(k>n){
            k=k%n;
        }
    //     long[] temp=new long[k];
    //     for(int i=0;i<k;i++){
    //         temp[i]=arr[i];
    //     }
        
    // for(int i=0;i<n-k;i++){
    //     arr[i]=arr[i+k];
    // }
    
    // for(int i=n-k;i<n;i++){
    //     arr[i]=temp[i-(n-k)];
    // }
    // for(long value:arr){
    //     System.out.print(value+" ");
    // }
    
    reverseArray(arr,0,k-1);
    reverseArray(arr,k,n-1);
    reverseArray(arr,0,n-1);
    return arr;
        
    }
    
    static void reverseArray(long[] arr,int start,int last){
        while(start<=last){
            long temp=arr[start];
            arr[start]=arr[last];
            arr[last]=temp;
            start++;
            last--;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] arr= {1,2,3,4,5,6,7,8};
		long[] rotate = leftRotate(arr, 3,arr.length);
		System.out.println(Arrays.toString(rotate));
	}

}
