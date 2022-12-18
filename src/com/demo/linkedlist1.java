package com.demo;

import java.util.Collections;
import java.util.LinkedList;

public class linkedlist1 {

	public static void main(String[] args) {
		
		
		LinkedList l = new LinkedList();
		
		
		l.add("a");
		l.add("b");
		l.add("d");
		l.add("q");
		l.add("z");
		l.add("k");
		l.add("y");
		System.out.println(l.size());

		LinkedList l2 = new LinkedList();
		
		
		l2.add("l");
		l2.add("y");
		l2.add("p");
		l2.add("s");
		l2.add("m");
		l2.add("c");
		l2.add("n");
		System.out.println(l2.size());
		LinkedList l3 = new LinkedList();
		
		
		l3.addAll(l);
		l3.addAll(l2);
		
		System.out.println(l3);
		System.out.println(l3.size());

		Collections.sort(l3);
		System.out.println(l3);
		
		Collections.sort(l3,Collections.reverseOrder());
		System.out.println(l3);
		System.out.println("-----------------------------");
		
		l3.addFirst("akshay");
		System.out.println(l3);
		l3.addLast("kore");
		System.out.println(l3);
		System.out.println(l3.getFirst());
		System.out.println(l3.getLast());
	}

}
