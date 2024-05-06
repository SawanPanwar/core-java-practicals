package com.rays.java8;

import java.util.Arrays;

public class TestParallelSort {

	public static void main(String[] args) {

		int[] arr = { 100, 1, 2, 50, 30, 25, 40};
		
		Arrays.parallelSort(arr);
		
		for (int i : arr) {
			
			System.out.println(i);
			
		}

	}

}
