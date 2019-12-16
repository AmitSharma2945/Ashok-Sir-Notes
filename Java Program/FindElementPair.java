package com.nt.java;

public class FindElementPair {

	public static void main(String[] args) {
	
		int ele[]=  {3, 6, 8, -8, 10, 8 };
		int lan=ele.length;
		
		
		for (int i = 0; i < ele.length; i++) {
			for (int j = i+1; j < ele.length; j++) {
				int sum=0;
				sum=ele[i]+ele[j];
			//	System.out.println("sum"+sum);
				if (sum==16) {
					System.out.println("Pairs with sum 16 are"+sum);
					
				}
			}
		}
		
	}

}
