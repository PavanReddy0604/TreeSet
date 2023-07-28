package firstLec;

import java.util.Arrays;

public class TwoOddOccurenceElements {
	
    public static int[] twoOddNum(int arr[], int N)
    {
        int[] res=new int[2];
        
        int xor=0;
        for(int i=0;i<N;i++)
        {
            xor=xor^arr[i];
        }
        
        int count=0;
        while(xor>=0)
        {
            if((xor&1)==1)
            break;
            count++;
            xor=xor>>1;
        }
        
        int xor1=0,xor2=0;
        for(int j=0;j<N;j++)
        {
            if((arr[j] & (1<<count))>0)
            xor1=xor1^arr[j];
            else
            xor2=xor2^arr[j];
        }
        
        if(xor1>=xor2){
        res[0]=xor1;
        res[1]=xor2;
        }
        else {
        res[0]=xor2;
        res[1]=xor1;
        }
        return res;
        
    }

	public static void main(String[] args) {
		int[] arr= {4, 2, 4, 5, 2, 3, 3, 1};
		int[] twoOddNum = twoOddNum(arr,arr.length);
		Arrays.stream(twoOddNum).forEach(n-> System.out.println(n +" "));

	}

}
