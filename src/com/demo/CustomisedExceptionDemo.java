package com.demo;

import java.util.Scanner;

public class CustomisedExceptionDemo {

	public static void main(String[] args) {

		System.out.println("Please Enter Your Age---->");
		Scanner sc = new Scanner(System.in);

		int age = sc.nextInt();

		if (age < 18) {
			throw new TooYoungException("Please Wait for Some-More Time Definetly " + "You Will Find Best Match");
		} else if (age > 60) {
			throw new TooYoungException("You Age Is too much for Marrige");
		} else {
			System.out.println("you will get match details soon by E-mail");
		}
	}

}
