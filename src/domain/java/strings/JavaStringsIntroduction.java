/*
 Input Format:
Two strings, the first being AA and the second being BB. 
They are comprised of lowercase English letters (no symbols or spaces) and may not be on the same line.

Output Format:
There are three lines of output: 
For the first line, sum the lengths of AA and BB. 
For the second line, write Yes if AA is lexicographically larger than BB or No if it is not. 
For the third line, capitalize the first letter in both AA and BB and print them on a single line, separated by a space.

Sample Input:
 hello
 java
Sample Output:
9
No
Hello Java
 */

package domain.java.strings;

import java.util.Scanner;

public class JavaStringsIntroduction {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        if(A.compareTo(B) > 0)
        	System.out.println("Yes");
        else
        	System.out.println("No");
        
        char[] arr = A.toCharArray();
        arr[0] = Character.toUpperCase(arr[0]);
        A = new String(arr);
        
        arr = B.toCharArray();
        arr[0] = Character.toUpperCase(arr[0]);
        B = new String(arr);
        
        System.out.println(A + " " + B);
        sc.close();

	}

}
