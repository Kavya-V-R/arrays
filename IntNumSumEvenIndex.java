package com.xworkz.array;

public class IntNumSumEvenIndex {
	public static void main(String[] args) {
		int sum = 0;
		int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		for (int i = 0; i <= 19; i++) {
			if (i % 2 == 0) {
				sum = sum + numbers[i];
			}
		}
		System.out.println(sum);
	}
}
