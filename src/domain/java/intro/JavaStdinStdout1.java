/*
 Problem Statement:
 In most of the HackerRank challenges, you need to read input from stdin (standard input) and write your output in stdout (standard output).
One way to take input from stdin is to use the Scanner class and read in from System.in.
You can write your output to stdout by simply using the System.out.println(String) function.
In this problem, you need to read 3 integers from stdin and print them in stdout.

Sample input:
42
100
125
Sample output:
42
100
125
To make the problem easier for you, part of the code is already provided in the editor.
 */
package domain.java.intro;

import java.util.Scanner;

public class JavaStdinStdout1 {
	public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	      int a=sc.nextInt();
	      int b=sc.nextInt();
	      int c=sc.nextInt();	         
	      System.out.println(a);
	      System.out.println(b);
	      System.out.println(c);
	      sc.close();
	    }

}
