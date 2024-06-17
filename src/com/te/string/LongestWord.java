package com.te.string;

import java.util.Arrays;
import java.util.List;

public class LongestWord {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple", "banana", "kiwi", "orange");
		String string = list.stream().max((a1,a2) -> Integer.compare(a1.length(), a2.length()))
				.orElse(null);
		System.out.println(string);
	}
}
