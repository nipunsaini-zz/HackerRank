package domain.math.fundamentals;

import java.util.Scanner;

public class ConnectingTowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int t = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < t; i++){
            int towns = Integer.parseInt(scan.nextLine());
            String str[] = scan.nextLine().split(" ");
            long routes = 1;
            for(String s : str){
            	routes = routes * Integer.parseInt(s);
            	routes %= 1234567;
            }
            System.out.println(routes);
        }        
        scan.close();

	}

}
