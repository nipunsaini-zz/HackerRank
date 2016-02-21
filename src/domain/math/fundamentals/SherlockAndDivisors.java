package domain.math.fundamentals;

import java.util.Scanner;

public class SherlockAndDivisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int t = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < t; i++){
            int n = Integer.parseInt(scan.nextLine());
            int count = 0;
            int s = (int)Math.sqrt(n);
            for(int j = 2; j <= s; j ++){
            	int q =  n / j ;
            	int r =  n % j;
            	if(r == 0){
            		if(q % 2 == 0)
            			count++;
            		if(j % 2 == 0 && j!=q)
            			count++;            		
            	}
            }
            if(n % 2 == 0){
            	count++;
            }
            System.out.println(count);
        }        
        scan.close();
	}

}
