package com.interviewPrblms;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class FirstNegNumberInSubArrayOfSizeK {

	public static long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        long res[]= new long[N-K+1];
        Deque<Long> dq=new ArrayDeque<>();
        int startWindow=0,endWindow=0;
        while(endWindow<N){
            if(A[endWindow]<0){    //12 ,-1,-7, 8, -15, 30, 16, 28};
                dq.offer(A[endWindow]);
                
            }
            if((endWindow-startWindow+1)<K) {
            endWindow++;
            continue;
            }
            
            if((endWindow-startWindow+1)==K){
                if(dq.size()==0){
                    res[startWindow]=0;
                }
                else{
                res[startWindow]=dq.peek();
                }
                if(A[startWindow]<0){
                    Long pollFirst = dq.pollFirst();
                }
                endWindow++;
                startWindow++;
                System.out.println(dq);
            }
        }
        return res;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] arr= {12 ,-1,-7, 8, -15, 30, 16, 28};
		long[] printFirstNegativeInteger = printFirstNegativeInteger(arr,arr.length,3);
		System.out.println(Arrays.toString(printFirstNegativeInteger));

	}

}
