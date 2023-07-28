package com.interviewPrblms;

import java.util.ArrayList;
import java.util.List;

public class MoveAllZeroesToEnd {
	
    static void pushZerosToEnd(int[] arr, int n) {
        // code here
        List<Integer> list=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
            list.add(arr[i]);
            }
            
        }
        int j=0;
        for(j=0;j<list.size();j++){
            arr[j]=list.get(j);
        }
        
        for(;j<n;j++){
            arr[j]=0;
        }
    }
    
    
    static void moveToLast(int[] arr,int n) {
    	 int j=-1;
    	 //for finding the first zero index
         for(int i=0;i<n;i++)
         {
             if(arr[i]==0){
                 j=i;
                 break;
             }
         }
         if(j==-1)
         return;
         
         for(int i=j+1;i<n;i++)
         {
             if(arr[i]!=0){
                 int temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
                 j++;
             }
         }
     }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,0,3,0,4,0};
		moveToLast(arr,arr.length);
		
		for(int value:arr) {
			System.out.println(value+" ");
		}
		
	}

}
