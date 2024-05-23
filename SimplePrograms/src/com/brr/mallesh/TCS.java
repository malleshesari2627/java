package com.brr.mallesh;

import java.util.Map;
import java.util.Scanner;

public class TCS {
	public static void main(String[] args) {
		int n;
		int pe;
		int pens;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of girls");
		n=sc.nextInt();
		System.out.println("enter the no of pencils");
		pe=sc.nextInt();
		System.out.println("enter the no of pens");
		pens=sc.nextInt();
		if(pe%n==0 && pens%n==0)
		{
			for(int i=1;i<=n;i++)
			{
				System.out.println("girl :"+i+" pens :"+pens/n+" pencils :"+pe/n);
			}
		}
		else
		{
			System.out.println("not distributed equally");
		}
	}
}

