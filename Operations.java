package com.info;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*perform below operation in stream
find unique element
sort in natural order
square them
find element which are greater than 5
 print all element*/

public class Operations {
	public static void main(String[] args) {
		int a[] = { 1, 9, 2, 6, 7, 9, 5, 8 };
		//Arrays.stream(a).distinct().forEach(System.out::println);
		// Arrays.stream(a).unordered().forEach(System.out::println);
		//Arrays.stream(a).sorted().forEach(System.out::println);// natural order
		// Arrays.stream(a).map(x->x*x).forEach(System.out::println);//square them
		// Arrays.stream(a).filter(x->x>5).forEach(System.out::println);//number greater than 5
		// Arrays.stream(a).forEach(System.out::println);//print all element
		int sum = Arrays.stream(a).sum();
		System.out.println(sum);

//		List<Integer> list = IntStream.of(a).boxed().collect(Collectors.toList());
//
//		list.stream().distinct().forEach(System.out::println);
	}
}
