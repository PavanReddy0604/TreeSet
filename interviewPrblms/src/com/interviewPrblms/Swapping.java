package com.interviewPrblms;

public class Swapping {

	public static void main(String[] args) {
		
		int num1=15,num2=16;
		//approach 1
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println(num1 +"  "+num2);
		
		//approach 2
		
		int a=15,b=16;
		
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a +"  "+b);
		
	}

}
