package com.te.string;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "racecar";
		String s2 = "carrace";
		
		s1 = Stream.of(s1.split(" ")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		s2 = Stream.of(s1.split(" ")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		if(s1.equals(s2)) {
			System.out.println("anagram");
		} else {
			System.out.println("not");
		}
		
		System.out.println("==========================================");
		
		Map<Character, Long> collect1 = s1.chars().mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Map<Character, Long> collect2 = s2.chars().mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		if(collect1.equals(collect2)) {
			System.out.println("anagram");
		} else {
			System.out.println("not a anagram");
		}
	}
}
