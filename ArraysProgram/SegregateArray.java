package com.nt.array;

import java.util.Arrays;

public class SegregateArray {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 2, 0, 0, 2, 1, 2, 0 };
		int lan = arr.length;
		int zero = 0;
		int count = 0;

		for (int j = 0; j < lan; j++) {
			if (arr[j] == 0)
				zero++;

			if (arr[j] == 1)
				count++;
		}
		for (int i = 0; i < zero; i++) {
			arr[i] = 0;
		}
		for (int i = zero; i < zero + count; i++) {
			arr[i] = 1;
		}
		for (int i = zero + count; i < lan; i++) {
			arr[i] = 2;
		}
  
    System.out.println(Arrays.toString(arr));
	}

}
 