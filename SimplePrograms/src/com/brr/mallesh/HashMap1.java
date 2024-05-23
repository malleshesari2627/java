package com.brr.mallesh;

import java.util.HashMap;

public class HashMap1 {
	public static void main(String[] args) {
		HashMap<Integer, String> h= new HashMap<>();
		h.put(101, "mallesh");
		h.put(102, "jeevan");
		h.put(104, "jeeva");
		h.put(103, "mani");
		System.out.println(h);
		System.out.println(h.keySet());
		System.out.println(h.values());
		System.out.println(h.containsKey(101));
		System.out.println(h.containsKey(101));
		
	}

}
