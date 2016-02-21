/*
 Problem statement:
 In this problem you will test your knowledge of Java loops. Given three integers a, b, and n, output the following series:
a+20b,a+20b+21b,......,a+20b+21b+...+2n−1b

Input Format:
The first line will contain the number of testcases t. Each of the next t lines will have three integers, a, b, and n.

Constraints:
0≤t≤500
0≤a,b≤50
1≤n≤15

Output Format:
Print the answer to each test case in separate lines.

Sample Input:
2
0 2 10
5 3 5

Sample Output:
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98

Explanation:
In the first case:
1st term=0+1*2=2
2nd term=0+1*2+2*2=6
3rd term=0+1*2+2*2+4*2=14
and so on.
 */
package domain.java.intro;

import java.util.Scanner;

public class JavaLoops {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        
        for(int i=0; i<t; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            long sum = a;
            for(int j=0; j<n; j++){
                sum = sum + (long)Math.pow(2,j)*b;
                System.out.print(sum + " ");
            }
             System.out.println();
        }
        scan.close();
    }

}
