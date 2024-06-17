package com.te.array;

import java.util.Arrays;

public class IdenticalArray {
	public static void main(String[] args) {
		int[] a1 = {1,2,3};
		int[] b1 = {1,2,3};
		boolean equals = Arrays.equals(a1, b1);
		if(equals) {
			System.out.println("two array are equals");
		} else {
			System.out.println("not equal");
		}
	}

}
