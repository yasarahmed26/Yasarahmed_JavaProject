package com.javaProject.Q3;

import java.util.Arrays;

public class Stream {
	public static void main(String[] args) {
		Integer[] numbers = { 1, 2, 3, 4, 5 };

		int sum = Arrays.stream(numbers).filter(n -> n % 2 != 0).map(n -> n * n).reduce(0, Integer::sum);

		System.out.println("SUM: " + sum);
	}
}