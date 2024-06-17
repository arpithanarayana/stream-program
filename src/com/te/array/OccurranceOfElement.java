package com.te.array;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurranceOfElement {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,2,2,3,3,4,5);
		Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	    System.out.println(collect);
	}

}