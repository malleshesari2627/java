package com.brr.mallesh;

public class SuperKeyWord {
	int d=50;
	public static void main(String[] args) {
		B c= new B();
		c.m2();
	}

}
 class A{
	String b="world";
	public void m1() {
		System.out.println("Hello");
	}
}
 class B extends A {
	 String b="abc";
	public void m1() {
		
		System.out.println("hello");
	}
	public void m2() {
		int a=10;
		int b=20;
		
		System.out.println(a);
		this.m1();
		System.out.println(super.b);
	}
}