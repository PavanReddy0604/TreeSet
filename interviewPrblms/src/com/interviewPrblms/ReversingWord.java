package com.interviewPrblms;

public class ReversingWord {

	public static void main(String[] args) {
		
		String word="PavanKavan";
		
		// approach 1
		String reversedWord="";
		for(int i=word.length()-1;i>=0;i--) {
			reversedWord+=word.charAt(i);
		}
		System.out.println("revresed word app 1---> "+reversedWord);
		
		
		//approach 2
		
		StringBuffer sb= new StringBuffer(word);
		sb.reverse();
		System.out.println("app2 ---> "+sb);
		
		int num=1516;
		String val=String.valueOf(num);
		System.out.println(val);
		StringBuffer s=new StringBuffer(val);
		System.out.println(s.reverse());

	}

}
