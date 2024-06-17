package com.te.string;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatingCharacterInString {
	public static void main(String[] args) {
		String s = "hello world";
		Map<Character, Long> collect = s.chars().mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		List<Character> collect2 = collect.entrySet().stream().filter(e -> e.getValue()==1).map(e -> e.getKey())
		.collect(Collectors.toList());
		System.out.println(collect2);
	}

}
