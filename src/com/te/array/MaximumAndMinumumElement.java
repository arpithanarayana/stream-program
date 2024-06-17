package com.te.array;

import java.util.Arrays;

public class MaximumAndMinumumElement {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int maximum = Arrays.stream(a).max().getAsInt();
		System.out.println(maximum);
		
		System.out.println("================================");
		
		int minimum = Arrays.stream(a).min().getAsInt();
		System.out.println(minimum);
	}

}
