package com.nt.java;

public class SmallestPairSum {

	public static void main(String[] args) {
		int[] ele={1,7,2,3,8,4,6};
		int min=ele[0];
		int secondmin=ele[1];
		
		for (int i = 0; i < ele.length; i++) {
			if (ele[i]<min) {
				secondmin=min;
				min=ele[i];
			}
			else {
				if (ele[i]<secondmin && ele[i]!=min) {
					secondmin=ele[i];
					
				}
			}
			System.out.println(min);
			System.out.println(secondmin);
			System.out.println("SUM."+(min+secondmin));
			
		}
		
		
	}

}
