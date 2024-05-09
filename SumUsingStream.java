package com.info;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

//Given a list if integer, find the sum using stream.
public class SumUsingStream {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 2, 2, 4, 6);
		int sum = list.stream().filter(Objects::nonNull) // This will filter out null values
				.mapToInt(Integer::intValue).sum();
		System.out.println(sum);
	}

}
