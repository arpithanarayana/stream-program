package com.te.array;

import java.util.Arrays;
import java.util.Comparator;

public class ThirdLargestElement {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6};
		Integer thirdLargest = Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).skip(2)
				.findFirst().get();
		System.out.println(thirdLargest);
		
		System.out.println("=============================================");
		
		int thirdSmallest = Arrays.stream(a).sorted().skip(2).findFirst().getAsInt();
		System.out.println(thirdSmallest);
	}

}
