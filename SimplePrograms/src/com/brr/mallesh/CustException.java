package com.brr.mallesh;

import java.util.Scanner;

public class CustException {
	public static void main(String[] args) {
		double avlBlc=12016.25;
		double wtdrBlc;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the withdraw amount");
		wtdrBlc=sc.nextDouble();
		if(avlBlc<wtdrBlc)
		{
			throw new InsufficientBalException("Insufficient balance");
		}
		else {
			System.out.println("please collect amount");
		}
	}

}
class InsufficientBalException extends RuntimeException
{
	public InsufficientBalException(String msg)
	{
		System.out.println(msg);
	}
}