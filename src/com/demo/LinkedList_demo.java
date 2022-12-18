package com.demo;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_demo {

	public static void main(String[] args) {

		LinkedList<Integer> l = new LinkedList<Integer>();

		l.add(1);
		l.add(2);
		l.add(343);
		l.add(45);
		l.add(12);
		l.add(14);
		l.add(17);
		l.add(343);
		l.add(19);
		l.add(65);
		l.add(100);
		
		System.out.println(l.get(7));

//		l.add(1, null);

		System.out.println(l); // for printing the LinkedList

		
		System.out.println(l.size());
		l.remove(1);
		System.out.println(l);
		l.add(5,666);
		System.out.println(l);
		l.set(0,10);
		System.out.println(l);
		System.out.println(l.contains(10));
		
		Collections.sort(l);
		System.out.println(l);
		System.out.println(l.isEmpty());
		
		//using for loop
		for (int i = 0; i < l.size(); i++) {
		System.out.println(l.get(i));	
		}
		//using foreach
		System.out.println("-------------");
		for (Integer integer : l) {
		
			System.out.println(integer);
		}
		System.out.println("-------------");
		//using iterator
		
		Iterator<Integer> itr=  l.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-------------");
		
		ListIterator<Integer> itr1=  l.listIterator(l.size());
		while (itr1.hasPrevious()) {
			System.out.println(itr1.previous());
		}
		System.out.println("-------------");
		
		
		
	}

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
