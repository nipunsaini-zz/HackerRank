package domain.math.fundamentals;

import java.util.Scanner;

public class Restaurant {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int t = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < t; i++){
        	String str[] = scan.nextLine().split(" ");
        	int l = Integer.parseInt(str[0]);
        	int b = Integer.parseInt(str[1]);
        	
        	int min = Math.min(l, b);
        	int hcf = 1;
        	for(int j = min; j >=1; j--){
        		if(l % j == 0 && b % j == 0){
        			hcf = j;
        			break;
        		}
        	}
        	
        	int res =  (l * b) / (hcf * hcf);
        	System.out.println(res);
        	
        }        
        scan.close();
	}

}
