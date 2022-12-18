package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BallSuffleGame {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();

		al.add(0);
		al.add(1);
		al.add(0);
		
		System.err.println("\t\t\t\tWel-Come to Ball-GAME");
		System.err.println(
				"TO WIN THE GAME CHOOSE THE CORRECT POSSITION OF NUMBER 1 OUT OUT OF {[0st],[1st],[2nd]} POSITION");

		System.out.println("\"CHOICE YOUR POSITION \n ALL THE BEST...........!!!!\"");
		Object sc = new Scanner(System.in);
		
		String name=((Scanner) sc).next();
	    int result = Integer.valueOf(name);
		
		

		Collections.shuffle(al);
		
		Collections.shuffle(al);
		
		Collections.shuffle(al);
		
		if(al.get(result)==1) {
			
			System.out.println("Yup............\n You Win The Game");
			
		}
	
		else {
			System.out.println("Sorry You Loss The GAME ");
		}
	
	
	}

}
