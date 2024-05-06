package p1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartingWith1 {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(12,32,4,5,6,7,11,13,14);
	List<String> collect = list.stream().map(String::valueOf).filter(x->x.startsWith("1")).collect(Collectors.toList());
	System.out.println(collect);
}
}
