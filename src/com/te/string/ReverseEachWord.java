package com.te.string;

import java.util.Arrays;

public class ReverseEachWord {
	public static void main(String[] args) {
		String s = "hello world";
		String string = Arrays.stream(s.split(" ")).reduce((s1,s2) -> s2 + " " + s1).orElse(" ");
		System.out.println(string);
	}

}
