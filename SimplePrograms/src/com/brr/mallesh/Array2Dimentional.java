package com.brr.mallesh;

import java.util.Iterator;
import java.util.Scanner;

public class Array2Dimentional {
	public static void main(String[] args) {
		int rowsize;
		int colsize;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the row size");
		rowsize=s.nextInt();
		System.out.println("enter the colomn size");
		colsize=s.nextInt();
		int a[][]= new int[rowsize][colsize];
		for(int i=0;i<=rowsize-1;i++)
		{
			for(int j=0;j<=colsize-1;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<=rowsize-1;i++)
		{
			for(int j=0;j<=colsize-1;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");
		}
		
	}

}
