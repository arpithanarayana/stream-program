package com.te.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseAnArray {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] array = IntStream.rangeClosed(1, a.length).map(i -> a[a.length-i]).toArray();
		System.out.println(Arrays.toString(array));
	}

}
