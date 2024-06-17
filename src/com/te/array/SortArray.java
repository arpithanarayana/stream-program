package com.te.array;

import java.util.Arrays;
import java.util.Comparator;

public class SortArray {
	public static void main(String[] args) {
		int[] a = {1,5,3,2,4};
		int[] array = Arrays.stream(a).sorted().toArray();
		System.out.println(Arrays.toString(array));
		
		System.out.println("==============================");
		
		Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
