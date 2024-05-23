package com.brr.mallesh;

//public class Throws {
//	public static void main(String[] args) {
//		System.out.println("Go to Sleep");
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("Awake");
//	}
//
//}
  public class Throws{
	  public static void main(String[] args) throws InterruptedException {
		System.out.println("Go to sleep ");
		Thread.sleep(3000);
		System.out.println("Awake");
	}
  }