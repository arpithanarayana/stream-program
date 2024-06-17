package com.te.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArray {
	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] b = {4,5,6};
		int[] array = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).toArray();
		System.out.println(Arrays.toString(array));
	}
}
