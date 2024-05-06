package p1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElements {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(21,2,3,4,2,23,1,23,21);
		Set<Object> set = new HashSet<>();
		list.stream().filter(x->!set.add(x)).forEach(System.out::println);
	}

}
