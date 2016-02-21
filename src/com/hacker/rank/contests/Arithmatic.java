package com.hacker.rank.contests;

import java.util.Scanner;

public class Arithmatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double M = scan.nextDouble();
		int T = scan.nextInt();
		int X = scan.nextInt();
		long price = Math.round(M + (T + X) * M /100);
		System.out.println("The final price of the meal is $"+price);
		scan.close();	
		

	}
	
}
