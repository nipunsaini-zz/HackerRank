package domain.math.fundamentals;

import java.util.Scanner;

public class ReverseGame {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int t = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < t; i++){
            String str[] = scan.nextLine().split(" ");
        	int n = Integer.parseInt(str[0]);
        	int k = Integer.parseInt(str[1]);
        	int arr[] = new int[n];
        	for(int j = 0; j < n; j++){
        		arr[j] = j;
        	}
        	
        	int right = n-1;
        	int left = 0;
        	boolean r = true;
        	boolean l = false;
        	int index = -1;
        	for(int x = 0; x <= n-1; x++){
        		if(r){
        			index  = right;
        			right--;
        		}
        		else{
        			index = left;
        			left++;
        		}
        		if(r){
        			r = false;
        			l = true;
        		}
        		else{
        			r = true;
        			l = false;
        		}
        		if(k == arr[index]){
        			System.out.println(x);
        			break;
        		}
        	}
        }        
        scan.close();
    }
}
