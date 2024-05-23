package com.brr.mallesh;

public class ThreadExample
{
public static void main(String[] args) {
	
	
}
}
class Mythread extends Thread
{
	public void run()
	{
		for (int i=1;i<=5;i++)
		{
			System.out.println("hello");
		}
	}
}