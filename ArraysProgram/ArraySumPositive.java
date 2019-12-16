package com.nt.array;

import java.util.Arrays;

public class ArraySumPositive {

	public static void main(String[] args) {
	
		int[] arr= {4, 5, 6};
		int arr1[]=new int[arr.length];
		int ele1=arr[0];
		int ele2=arr[0];
		int temp=0;
		
		for (int i = 0; i < arr.length; i++) {
			int sum=0;
			for (int j = 0; j < arr.length; j++) {
				ele1=arr[j];
				sum=sum+ele1;
			}
			temp=sum-arr[i];
			arr1[i]=temp;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
	}

}
