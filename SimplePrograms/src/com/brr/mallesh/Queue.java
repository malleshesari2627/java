package com.brr.mallesh;

import java.util.PriorityQueue;

public class Queue {
	public static void main(String[] args) {
		PriorityQueue<Object> q=new PriorityQueue<Object>();
		q.add("M");
		q.add("a");
		q.add("l");
		q.add("l");
		q.add("e");
		q.add("s");
		q.add("h");
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.contains("e"));
		while (q.peek()!=null) {
			System.out.println(q.poll());
			
		}
		System.out.println(q+"after looping");
	}

}
