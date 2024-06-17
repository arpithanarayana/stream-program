package com.te.string;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurranceOfString {
	public static void main(String[] args) {
		String s = "hello world";
		Map<Character, Long> collect = s.chars().mapToObj(c -> (char)c).
		collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect);
	}
}
