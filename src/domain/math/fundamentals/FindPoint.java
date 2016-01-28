/*
Given two points P and Q, output the symmetric point of point P about Q.

Input Format:
The first line contains an integer T representing the number of testcases
Each test case is a line containing four space separated integers Px Py Qx Qy representing the (x,y) coordinates of P and Q.

Constraints:
1⩽T⩽15
−100⩽x,y⩽100

Output Format:
For each test case output x and y coordinates of the symmetric point (each point in a new line).

Sample Input:
2
0 0 1 1
1 1 2 2
Sample Output:
2 2
3 3
 */
package domain.math.fundamentals;

import java.util.Scanner;

public class FindPoint {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < t; i++){
            String str[] = scan.nextLine().split(" ");
            int px = Integer.parseInt(str[0]);
            int py = Integer.parseInt(str[1]);
            int qx = Integer.parseInt(str[2]);
            int qy = Integer.parseInt(str[3]);
            
            int x = 2 * qx - px;
            int y = 2 * qy - py;
            
            System.out.println(x + " " + y);
            
        }        
        scan.close();

    }

}
