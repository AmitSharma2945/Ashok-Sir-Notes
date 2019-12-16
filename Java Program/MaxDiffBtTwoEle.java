package com.nt.java;

public class MaxDiffBtTwoEle {

	public static void main(String[] args) {
		int[] ele={1,2,3,4,5,6,7,8};
		int i=ele[0];
		int j=ele[0];
		
		for (int j2 = 0; j2 < ele.length; j2++) {
			if (ele[j2]>i) {
				i=ele[j2];
			}
			else {
				if (ele[j2]<j) {
					j=ele[j2];
					
				}
			}
			System.out.println(i);
			System.out.println(j);
			System.out.println("DiffBtTowElement..."+(i-j));
			
		}
		
		
	}

}
