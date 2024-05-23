package com.brr.mallesh;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		int size;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		size=s.nextInt();
		int []a=new int[size];
		System.out.println("Insert the elements into array");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println(a);
		System.out.println("elements of the array is...");
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}
		System.out.println(" elements of the array in reverse order...");
		for (int j=a.length-1;j>=0;j--)
		{
			System.out.println(a[j]);
		}
	}

}
