package com.brr.mallesh;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
public static void main(String[] args) {
	HashSet h=new HashSet();
	h.add("mallesh");
	h.add(2627);
	h.add('e');
    h.add(72.5);
    System.out.println(h);
    
    Iterator i =h.iterator();
    while(i.hasNext())
    {
    	System.out.println(i.next());
    }
}
}
