package com.demo;

public class Flow {

	public  void m1(int a) {
		
		System.out.println("inside m1 int method----------->"+a);
	}

	public static void m1(long a) {

		System.out.println("inside m1 long method----------->" + a);
	}

	public static void m1(double a) {

		System.out.println("inside m1 double method----------->" + a);
	}
	
	public static void m1(short a) {

		System.out.println("inside m1 short method----------->" + a);
	}
	
	
	public static void main(String[] args) {

		Flow f = new Flow();
		
		f.m1(10);

	}

}
