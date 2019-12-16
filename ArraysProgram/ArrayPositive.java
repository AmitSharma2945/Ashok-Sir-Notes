package com.nt.array;

import java.util.Arrays;

public class ArrayPositive {

	public static void main(String[] args) {
     
		int[] arr={10, 20, 30, 40, 50, 60, 70, 80, 90, 100,};
		int lan=arr.length;
		int small=0;
		int large=lan-1;
		boolean flag=true;
		int temp[]=new int[lan];
		
		for (int i = 0; i < lan; i++) {
		
			if (flag) 
	        	temp[i]=arr[large--];
			else 
				temp[i]=arr[small++];
				
				flag= !flag;			
			}	
	         arr =temp;
	       
	         System.out.println("Modified Array "); 
	         System.out.println(Arrays.toString(arr)); 

	  	}		

}

