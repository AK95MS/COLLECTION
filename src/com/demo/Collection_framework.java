package com.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Collection_framework {

	public static void main(String[] args) {

		ArrayList<String> AL = new ArrayList<String>();

		AL.add("AKSHAY");
		AL.add("CHETAN");
		AL.add("AMIT");
		AL.add("ASHISH");
		AL.add("UTKARSH");
		AL.add("SHWET");
		AL.add("AKSHAY");

		ArrayList<String> AL1 = new ArrayList<String>();

		AL.add("NITIN");
		AL.add("DOLLY");
		AL.add("SUNNY");
		AL.add("JULIA");
		AL.add("JONNY SINGH");
		AL.add("MIA");
		AL.add("SAI");

		
		
		System.out.println("AL->" + AL.toString());

		LinkedList<Object> L = new LinkedList<Object>();

		L.add(AL);


		
		
		
		
		System.out.println("LL->" + L.toString());

		Vector<Object> v = new Vector<Object>();

		v.add(L);
		System.out.println("VECTOR->" + v.toString());

		HashSet<Object> HS = new HashSet<Object>();
		HS.add(v);
		System.out.println("HASHSET->" + HS);

		TreeSet<Object> TS = new TreeSet<Object>();
		System.out.println("-----------+++++++++");

		Iterator<String> itr = AL.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.err.println("-----------+++++++++");
		ListIterator<String> litr = AL.listIterator(AL.size());

		while (litr.hasPrevious()) {

			System.out.println(litr.previous());

		}
		System.err.println("-----------+++++++++");
		AL.forEach(e -> System.err.println(e));

		System.out.println("-----------------------------------");

		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("A");
			}

			System.out.println();
		}

		System.out.println("-----------------------------------");

		for (int i = 0; i <= 4; i++) {

			for (int j = 4; j > i; j--) {
				System.out.print("A");
			}

			System.out.println();
		}

		System.out.println("-----------------------------------");

		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("A");
			}

			System.out.println();
		}
		for (int i = 0; i <= 4; i++) {

			for (int j = 3; j > i; j--) {
				System.out.print("A");
			}

			System.out.println();
		}

		
		Set<String> s = new HashSet<>();

		s.addAll(AL);
		s.addAll(AL1);
		System.out.println(s);
	
	}

	
	
	

	
}
