package p1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EvenNumber {
	public static void main(String[] args) {

	List<Integer> list = Arrays.asList(12,4,6,1,98);
	 list.stream().filter(x->x%2==0).forEach(System.out::println);//collect(Collectors.toList());
	//System.out.println(collect);
	
	
	}
}
