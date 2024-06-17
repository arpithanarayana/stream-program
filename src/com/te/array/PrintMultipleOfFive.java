package com.te.array;

import java.util.Arrays;
import java.util.List;

public class PrintMultipleOfFive {
	public static void main(String[] args) {
		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        listOfIntegers.stream().filter(i -> i%2==0).forEach(System.out::println);
	}

}
