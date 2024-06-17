package com.te.string;

import java.util.stream.IntStream;

public class StringPalindrome {
	public static void main(String[] args) {
		String s = "mom";
		boolean noneMatch = IntStream.range(0, s.length()/2)
				.noneMatch(i -> s.charAt(i)!=s.charAt(s.length()-i-1));
		if(noneMatch) {
			System.out.println("palindrome");
		} else {
			System.out.println("not");
		}
	}

}
