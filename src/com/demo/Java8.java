package com.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Java8 {

	public static void main(String[] args) {
	
			
//	
//	drawable k  = (a)-> {	System.out.println(a);
//	return a;
//	
//	};
//	int ak=k.get(10);
//	System.out.println(ak);
//	

	List<Integer> l =Arrays.asList(10,20,30,40,10,27,77,94,39,77,27);
	
	
	l.stream().filter(e->e%2==0).forEach(System.out::println);
	System.out.println("---------------------------------------");
	Set<Integer> hs= new HashSet<>();
	
	l.stream().filter(e -> !hs.add(e)).forEach(System.out::println);
	
	System.out.println("---------------------------------------");
	Set<Integer> hs1= new HashSet<>();
	
	l.stream().filter(e -> hs1.add(e)).forEach(System.out::println);
	System.out.println("---------------------------------------");
	l.stream().sorted(Collections.reverseOrder()).distinct().forEach(System.out::println);
	}
	
	
		
	
}


