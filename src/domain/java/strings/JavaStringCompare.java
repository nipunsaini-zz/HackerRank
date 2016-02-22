/*
 Given a string, find out the lexicographically smallest and largest substring of length k.
[Note: Lexicographic order is also known as alphabetic order dictionary order. So "ball" is smaller than "cat", "dog" is smaller than "dorm". Capital letter always comes before smaller letter, so "Happy" is smaller than "happy" and "Zoo" is smaller than "ball".]

Input Format:
First line will consist a string containing english alphabets which has at most 1000 characters. 2nd line will consist an integer k.

Output Format:
In the first line print the lexicographically minimum substring. In the second line print the lexicographically maximum substring.

Sample Input:
welcometojava
3
Sample Output:
ava
wel
 */
package domain.java.strings;

import java.util.Scanner;

public class JavaStringCompare {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String msg = scan.next();
        int k = scan.nextInt();
        String min = msg.substring(0,k);
        String max = min;
        
        for(int i=1; i<=msg.length()-k; i++){
            String sub = msg.substring(i,i+k);
            if(sub.compareTo(min)<0){
                min = sub;
            }
            if(sub.compareTo(max)>0){
                max = sub;
            }
        }
        System.out.println(min);
        System.out.println(max);
        scan.close();

	}

}
