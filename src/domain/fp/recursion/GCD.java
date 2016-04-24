package domain.fp.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GCD {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] values = br.readLine().split(" ");
		int x = Integer.parseInt(values[0]);
		int y = Integer.parseInt(values[1]);
		System.out.println(getGCD(x, y));
	}
	
	public static int getGCD(int x, int y){
		if(y == 0)
			return x;
		return getGCD(y, x % y);
	}

}
