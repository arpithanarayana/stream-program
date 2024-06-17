package com.te.string;

import java.util.Arrays;
import java.util.List;

public class StringStartWithNumber {
	public static void main(String[] args) {
		List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
        listOfStrings.stream().filter(e -> Character.isDigit(e.charAt(0))).forEach(System.out::println);
	}

}
