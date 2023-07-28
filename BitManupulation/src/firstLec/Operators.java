package firstLec;

public class Operators {

	public static void main(String[] args) {
		
		int a=4,b=6;
		System.out.println(a +"&" +b+" is "+ (a&b));
		System.out.println(a +"|" +b+" is "+ (a|b));
		System.out.println(a +"^" +b+" is "+ (a^b));
		
		int n=10;
		System.out.println(n+" right shift by 2 is "+(n>>2));
		System.out.println(n+" left shift by 2 is "+(n<<2));
		System.out.println(Math.pow(2, 5)+Math.pow(2, 3));
		
		
	//finding xor of 1 to n i.e 1^2^4^....^n
		
		int num=3;
		if(num%4==0)
			System.out.println(num);
		if(num%4==1)
			System.out.println(1);
		if(num%4==2)
			System.out.println(num+1);
		if(num%4==3)
			System.out.println(0);
		
	}

}
