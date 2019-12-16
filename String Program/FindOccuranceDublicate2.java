package com.nt.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindOccuranceDublicate2 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("p");
		list.add("r");
		list.add("o");
		list.add("g");
		list.add("r");
		list.add("a");
		list.add("m");
		list.add("i");
		list.add("g");
 		
		Set<String> uniqueSet = new HashSet<String>(list);
		for (String temp : uniqueSet)
		{
		    System.out.println(temp + ": " + Collections.frequency(list, temp));
		}
	}

}
