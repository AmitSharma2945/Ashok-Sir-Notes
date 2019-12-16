package com.nt.java;

public class FindDublicate {
	
	public static void main(String[] args) {
		int v1[]= {1,2,2,6,6,5,7,7};
		int l=v1.length;
		System.out.println(l);
		System.out.println("===================");
		
		for (int i = 0; i <=l-1; i++) { 
			for (int j = i+1; j <=l-1; j++) {
				if (v1[i]==v1[j]) {
            System.out.println(v1[j]);					
				}
			}
		}

	}

}
