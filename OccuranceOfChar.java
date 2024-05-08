package com.info;

import java.util.Map;
import java.util.stream.Collectors;

public class OccuranceOfChar {
	public static void main(String[] args) {
		String s = "reshmae";
		Map<Character, Long> collect = s.chars().mapToObj(x -> (char) x)
				.collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		System.out.println(collect);
	}

}
