package com.nt.string;

public class ReversWthoutMethod {

	public static void main(String[] args) {
		
		String s1="java programming language";
		int lan=s1.length();
		String temp="";
		
		for (int i=lan-1;i>=0; i--) {
			temp=temp+s1.charAt(i);	
		}
		System.out.println("Revers Orignal::"+s1);
		System.out.println("Reverse String::"+temp);
		
	}

}
