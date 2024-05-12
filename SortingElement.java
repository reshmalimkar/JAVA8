package com.info;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortingElement {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,54,1,2,5,6,0);
		List<Integer> collect = list.stream().sorted().collect(Collectors.toList());//natural sorting
		System.out.println(collect);
		List<Integer> SortedDesc = list.stream().sorted((a,b)->(a>b?-1:a<b?1:0)).collect(Collectors.toList());//Custom/Descending Order
	    System.out.println(SortedDesc);
	    List<Integer> sortedAsc = list.stream().sorted((a,b)->a.compareTo(b)).collect(Collectors.toList());//Ascending order
	    System.out.println(sortedAsc);
	    List<Integer> desc = list.stream().sorted((a,b)->-a.compareTo(b)).collect(Collectors.toList());//Ascending order
	    System.out.println(desc);
	    List<Integer> sortedDes = list.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());//Descending Order
	    System.out.println(sortedDes);
	   
	}

}
