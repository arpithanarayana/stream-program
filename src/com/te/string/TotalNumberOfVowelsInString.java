package com.te.string;

import java.util.stream.Collectors;

public class TotalNumberOfVowelsInString {
	public static void main(String[] args) {
		String s = "hello world";
		long count = s.chars().filter(f -> "aeiou".indexOf(f)!=-1).count();
		System.out.println(count);
		
		System.out.println("=======================================");
		
		String collect = s.chars().filter(f -> "aeiou".indexOf(f)!=-1).mapToObj(c -> String.valueOf((char)c))
		.collect(Collectors.joining());
		System.out.println(collect);
	}

}
