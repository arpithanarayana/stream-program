package com.te.array;

import java.util.Arrays;

public class SumOfArray {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int sum = Arrays.stream(a).sum();
		System.out.println(sum);
		
		System.out.println("=========================");
		
		// averange of element
		double asDouble = Arrays.stream(a).average().getAsDouble();
		System.out.println(asDouble);
	}

}
