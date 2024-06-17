package com.te.string;

import java.util.stream.Collectors;

public class RemoveDuplicateInString {
	public static void main(String[] args) {
		String s = "hello world";
		String collect = s.chars().mapToObj(c -> String.valueOf((char)c)).distinct()
		.collect(Collectors.joining());
		System.out.println(collect);
	}

}
