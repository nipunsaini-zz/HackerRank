/*
Problem Statement:
At the annual meeting of Board of Directors of Acme Inc, every one starts shaking hands with everyone else in the room. 
Given the fact that any two persons shake hand exactly once, Can you tell the total count of handshakes?

Input Format:
The first line contains the number of test cases T, T lines follow.
Each line then contains an integer N, the total number of Board of Directors of Acme.

Output Format:
Print the number of handshakes for each test-case in a new line.

Constraints:
1 <= T <= 1000
0 < N < 106
Sample Input:
2
1
2
Sample Output:
0
1
Explanation:
Case 1 : The lonely board member shakes no hands, hence 0.
Case 2 : There are 2 board members, 1 handshake takes place. 
 */
package domain.math.fundamentals;

import java.util.Scanner;

public class Handshake {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < t; i++){
            int n = Integer.parseInt(scan.nextLine());
            int res = n * (n-1) / 2;
            System.out.println(res);
        }        
        scan.close();

    }

}
