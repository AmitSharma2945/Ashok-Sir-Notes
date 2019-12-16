package com.nt.java;

import java.util.Scanner;

public class FindDublicateArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 5, 6, 6, 7, 2 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		 int[] a = new int[55];
		int i = 0, count = 0;
		while (n != 0) {
			int num = n % 10;
			a[i] = num;
			i++;
			n = n / 10;
		}
		for (int j = 0; j <= i - 1; j++) {
			for (int k = j + 1; k <= i - 1; k++) {
				if (a[j] == a[k]) {
					count++;
				}
			}
		}
		if (count > 0) {
			System.out.println("Not Unique");
		} else {
			System.out.println("Unique");
		}
	}
}
