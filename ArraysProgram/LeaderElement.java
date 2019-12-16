package com.nt.array;

public class LeaderElement {

	public static void main(String[] args) {

		int arr[] = { 1, 6, 6, 5, 7, 4,1, 7, 7, 7, 7, 7, 7, 7, 2 };
		int lan = arr.length;
		int leader = lan / 2;
	 System.out.println("LengthArray...."+lan);
		int temp = arr[0];
		int count = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				count++;
				if (leader <= count) {
					temp = arr[i];
				}
			}
		}
		System.out.println(temp);
	}

}
