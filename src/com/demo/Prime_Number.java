package com.demo;

import java.util.ArrayList;

public class Prime_Number {

	public static boolean isPrime(int a) {

		if (a < 2) {

			return false;
		}
		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {

				return false;
			}

		}
		return true;

	}

	public static void main(String[] args) {

		for (int i = 1; i < 100; i++) {

			if (isPrime(i)) {

				System.out.println(i);
			}

		}

	}

}
