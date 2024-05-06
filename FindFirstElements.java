package p1;

import java.util.Arrays;
import java.util.List;

public class FindFirstElements {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(22,1,2,3,4,5,5);
		list.stream().findFirst().ifPresent(System.out::println);
	}

}
