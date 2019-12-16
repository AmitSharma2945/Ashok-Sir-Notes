package com.nt.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDublicate {

	public static void main(String[] args) {
		List<Integer> list=null;
		Set<Integer> set=null;
	    
		list=Arrays.asList(1,2,5,4,5,6,2,4);
	    set=new HashSet<Integer>(list);
	    list=new ArrayList<Integer>(set);
		  
	    System.out.println("===========");
	     System.out.println(set);
	}
	
}
