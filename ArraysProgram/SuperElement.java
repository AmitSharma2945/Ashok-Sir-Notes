package com.nt.array;

public class SuperElement {

	public static void main(String[] args) {

		int[] arr = { 1, 5, 3, 6 };
		int lan = arr.length;
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int k = 0; k < arr.length; k++) {

				if (arr[i] < arr[k]) {
					count++;
					temp = arr[i];
				}
			}
			if (count >=2) {
				System.out.println("SuperElement..." + temp);
			}
		}
	}

}
