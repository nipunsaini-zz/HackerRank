package domain.math.fundamentals;

import java.util.Scanner;

public class SherlockAndMovingTiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str[] = scan.nextLine().split(" ");
		int l = Integer.parseInt(str[0]);
		int s1 = Integer.parseInt(str[1]);
		int s2 = Integer.parseInt(str[2]);
		int relativeSpeed = Math.abs(s1 - s2);
		int numQuery = Integer.parseInt(scan.nextLine());
		for(int i = 0; i < numQuery; i++){
            long q = Long.parseLong(scan.nextLine());
            double distance = Math.sqrt(2) * (l - Math.sqrt(q));
            double time = distance / relativeSpeed;
            System.out.println(time);
        }        
        scan.close();
	}

}
