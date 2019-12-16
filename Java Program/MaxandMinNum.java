package com.nt.java;

public class MaxandMinNum {

	public static void main(String[] args) {
		int[] ele={1,2,3,5,5,6,6,7,2};
		int a=ele[0];
		int b=ele[0];
		
		for (int i = 0; i < ele.length; i++) {
			if (ele[i]>a) {
				a=ele[i];
			}
			else {
				if (ele[i]<b) {
					b=ele[i];
					
				}
			}
			System.out.println("Max Num::"+a);
			System.out.println("Min Num::"+b);		
		}
		
		
	}

}
