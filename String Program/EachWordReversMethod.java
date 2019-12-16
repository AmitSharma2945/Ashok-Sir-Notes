package com.nt.string;

public class EachWordReversMethod {

	public static void main(String[] args) {

		String s1 = "Java Programing language";
		String words[] = s1.split("\\s");
		String rev = "";

		for (String sw : words) {
			StringBuffer sb = new StringBuffer(sw);
			sb.reverse();
			rev += sb +" ";
		}
		System.out.println("Revers Before String::" + s1);
		System.out.println("Revers after String::" + rev);
	}

}
