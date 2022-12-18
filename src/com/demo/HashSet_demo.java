package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet_demo {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		hs.add(6);
		hs.add(7);
		hs.add(8);
		hs.add(9);
		hs.add(10);
		hs.add(11);
	
HashSet<Integer> hs1 = new HashSet<>();
		
		hs1.add(5);
		hs1.add(6);
		hs1.add(7);
		hs1.add(8);
		hs1.add(9);
		hs1.add(10);
		hs1.add(11);
		hs1.add(12);
		hs1.add(13);
		hs1.add(14);
		hs1.add(15);
			
		
		HashSet hs2 = new HashSet();
		hs2.addAll(hs);
		hs2.addAll(hs1);
		System.out.println(hs);
		System.out.println(hs1);
		
		//union-[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]

		System.out.println(hs2);
	
		//intersection
	
		hs2.stream().distinct().sorted().forEach(e->System.out.println(e));
	
	}
		
	
		
	}


