package com.te.string;

import java.util.stream.Collectors;

public class TotalNumberOfConsonate {
	public static void main(String[] args) {
		String s = "hello world";
		String collect = s.chars().filter(f ->"aeiou".indexOf(f)==-1 && Character.isLetter(f)).mapToObj(c -> String.valueOf((char)c))
		.collect(Collectors.joining());
		System.out.println(collect);
		
		System.out.println("============================");
		
		long count = s.chars().filter(f -> "aeiou".indexOf(f)==-1 && Character.isLetter(f)).count();
		System.out.println(count);
	}

}
