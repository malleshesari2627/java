package com.brr.mallesh;

//public class ExceptionPrograms {
//	public static void main(String[] args) {
//	
//		int a=5;
//		int b=0;
//		int c;
//		try{
//			c=a/b;
//		}
//		catch (ArithmeticException e) {
//			// TODO: handle exception
//			System.out.println(e);
//		}
//		finally {
//			System.out.println();
//		}
//		
//	}
//}


class Age extends RuntimeException
{
	public Age(String msg)
	{
		System.out.println(msg);
		
	}
}
public class ExceptionPrograms{
	public static void main(String[] args) {
		int bAge=20;
		if(bAge>=18)
		{
			throw new Age("person is not elgible for caste a vote");
		}
		else {
			System.out.println("your are a kid.");
		}
		
	}
}