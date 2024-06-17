package com.te.array;

import java.util.Arrays;

public class LinearSearch {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int target = 3;
		boolean anyMatch = Arrays.stream(a).anyMatch(e -> e==target);
		if(anyMatch) {
			System.out.println("element is present");
		} else {
			System.out.println("element is not present");
		}
	}
}
