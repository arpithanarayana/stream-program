package com.te.array;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestElement {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		Integer secondMaximum = Arrays.stream(a).boxed().sorted(Comparator.reverseOrder())
				.skip(1).findFirst().get();
		System.out.println(secondMaximum);
		
		System.out.println("====================================");
		
		int secondMinimum = Arrays.stream(a).sorted().skip(1).findFirst().getAsInt();
		System.out.println(secondMinimum);
	}

}
