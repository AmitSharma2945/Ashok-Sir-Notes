package com.nt.string;

public class ReversString {

	public static void main(String[] args) {
	
		String s1="Java Programing";
		
		StringBuffer br=new  StringBuffer(s1);
	
		System.out.println("Revers Before String::"+br);
 
		//br.reverse();

		System.out.println("Revers after String::"+new StringBuffer(br).reverse());
	}

}
