package com.brr.mallesh;

import java.util.Scanner;

public class DecreasingArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of an array:");
		size = s.nextInt();
		System.out.println("Enter the data : ");
		int a[] = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
//for comparing and swapping
		int temp;
		for (int j = 0; j < a.length; j++) {
			for (int k = 0; k < a.length - 1; k++) {
				if (a[k] < a[k + 1]) {
					temp = a[k];
					a[k] = a[k + 1];
					a[k + 1] = temp;
				}
			}
		}
//for printing sorted array
		for (int m = 0; m < a.length; m++) {
			System.out.println("a[" + m + "]=" + a[m]);
		}
	}
}
