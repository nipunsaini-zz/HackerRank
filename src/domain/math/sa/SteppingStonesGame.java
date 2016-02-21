/*
 Problem Statement:
 Bob sees his younger brother, Jack, playing Stepping Stones. 
 He is fascinated by the most interesting game and decides to play it.
Square boxes have been made on the ground with the help of chalk powder, and a number is assigned to each block. 
Bob is standing in front of these blocks. 
From here, he will throw a stone 1 block far, move to that block; 
pick up the stone and then he will throw the stone two blocks far from here, move to that block; 
pick up the stone, and throw the stone three blocks far from here, move to that block, and so on. 
What's the catch of the game??. The catch of the game is to check if it is possible to reach Nth block in this manner.
Bob is a bit lazy. He will make a move only if he is sure that he can reach the Nth block. So, tell him if he should make a move or not?

Input Format:
First line of input contains an integer T denoting the number of times Bob plays this game. 
Each of the next T lines contains a single integer N denoting the Nth block.

Output Format:
Output consists of several lines as per the following criteria: If bob is able to reach Nth block, then print Go On Bob with the number of moves required to reach to the Nth block both separated by a space. 
If Bob is not able to reach the Nth block, then print Better Luck Next Time.
Constraints:
1≤T≤105
1≤N≤1018
Sample Input #00:
1
2
Sample Output #00:
Better Luck Next Time

Explanation: #00:
Bob can jump to the 1st Block. From here, he is allowed to make a move to the 3rd Block only. 
So,he cannot step onto 2nd Block.

Sample Input #01:
1
3
Sample Output #01:
Go On Bob 2

Explanation: #01:
As explained in the previous test case, Bob can make a second move to reach to the 3rd Block. 
So, he can step on 3rd block in just 2 moves.

 */
package domain.math.sa;

import java.util.Scanner;

public class SteppingStonesGame {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < t; i++){
            long n = Long.parseLong(scan.nextLine());
            long count = 0;
            double squareRoot = Math.sqrt(1+8*n);
            double sqrtFloor = Math.floor(squareRoot);
            if(sqrtFloor == squareRoot){
                count = (-1 + (long)squareRoot) / 2;
                System.out.println("Go On Bob " + count);
            }
            else{
                System.out.println("Better Luck Next Time");
            }
                        
        }        
        scan.close();
    }

}
