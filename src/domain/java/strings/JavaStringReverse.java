/*
 A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
Given a string AA, print "Yes" if it is a palindrome, print "No" otherwise. The strings will consist lower case english letters only. The strings will have at most 50 characters.

Some examples of palindromes are "madam", "anna", "reviver".

Sample Input:
madam
Sample Output:
Yes
 */
package domain.java.strings;

import java.util.Scanner;

public class JavaStringReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        if(checkPalindrom(A))
            System.out.println("Yes");
        else
            System.out.println("No");
        sc.close();

	}
	public static boolean checkPalindrom(String str){
        int length = str.length();
        for(int i=0; i < length/2 + 1; i++){
        	if(str.charAt(i) != str.charAt(length - i - 1))
        		return false;
        }
        return true;        
    }

}
