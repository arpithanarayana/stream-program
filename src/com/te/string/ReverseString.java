package com.te.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {
	public static void main(String[] args) {
		String s = "hello world";
		String collect = Arrays.stream(s.split(" ")).map(word -> new StringBuffer(word).reverse())
		                    .collect(Collectors.joining(" "));
		System.out.println(collect);
	}
}
