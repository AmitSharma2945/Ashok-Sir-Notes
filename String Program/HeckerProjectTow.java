package com.nt.string;

public class HeckerProjectTow {

	static String strVal;

	public static void main(String[] args) {

		HeckerProjectTow h1 = new HeckerProjectTow();

		strVal = h1.getString("program");
	
		System.out.println(" " + strVal);
	}
	public static String getString(String str) {

		StringBuffer sb = new StringBuffer(str.length());

	//	System.out.println("Convert String..." + str);

		for (int i = str.length() - 1; i >0; i--) {

			sb.append(str.charAt(i));
		}

		return sb.toString();

	}

}
