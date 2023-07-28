package firstLec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PowerSet {
	
	private static String[] powerSet(String word) {
		int n=word.length();
		String[] powerSet=new String[1<<n];
		//powerSet[0]="";
		
		for(int i=0;i<(1<<n);i++)
		{
			String possibility="";
			for(int j=0;j<n;j++)
			{
				if((i & (1<<j)) !=0)
					possibility+=word.charAt(j);
			}
			powerSet[i]=possibility;
		}
		return powerSet;
	}
	
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
	            if((arr[j]&(1<<count))==1)
	            xor1=xor1^arr[j];
	            else
	            xor2=xor2^arr[j];
	        }
	        
	        if(xor1>=xor2){
	        res[0]=xor1;
	        res[1]=xor2;
	        }
	        else
	        res[0]=xor2;
	        res[1]=xor1;
	        
	        return res;
	    }

	public static void main(String[] args) {
		String[] allCombinations = powerSet("abc");
		System.out.println("started");
		//Arrays.stream(allCombinations).forEach(n-> System.out.println(n));
		List<List<Integer>> a=new ArrayList<>();
		int[] arr={4, 2, 4, 5, 2, 3, 3, 1};
		int length=arr.length;
		int[] twoOddNum = twoOddNum(arr,length);
		Arrays.stream(twoOddNum).forEach(n-> System.out.println(n));
		
	}

}
