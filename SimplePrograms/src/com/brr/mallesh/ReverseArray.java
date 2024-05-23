package com.brr.mallesh;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) 
	{
		int size;
		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		size=s.nextInt();
		int []a=new int[size];
		for (int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		for (int j=a.length-1;j>=0;j--)
		{
			System.out.println(a[j]);
		}
	}

}
