package com.jsp.Algarithoms;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = { 3, 2, 2, 6, 9, 8, 7, 1, 4, 2, 0, 11, 22222 };
		sort(a);
		for (int n : a) {
			System.out.print(n + " ");
		}
	}

	public static void sort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}

}
