package com.te.string;

import java.util.stream.Collectors;

public class RemoveWhiteSpaceInString {
	public static void main(String[] args) {
		String s = "This  is  a sample";
		String collect = s.chars().filter(e -> !Character.isWhitespace(e)).mapToObj(c -> String.valueOf((char)c))
		.collect(Collectors.joining());
		System.out.println(collect);
	}

}
