package com.demo;

public class Factorial {

	public static void factorial(int a) {

		System.out.println("Given Number Is------>" + a);
		int factorial = 1;
		for (int i = 1; i <= a; i++) {

			factorial = factorial * i;

		}

		System.out.println("Given Number Factorial Is------>" + factorial);

	}

	public static int fac( int a) {
		
		if (a==0) {
			return 1;
		}
		else {
			return(a*fac(a-1));
		}
	}
	
	
	
	public static void main(String[] args) {

		int a = 6;

		int b= 5;
		factorial(a);

		
	System.out.println(fac(b));
	
	}

}
