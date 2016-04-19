package domain.algo.bits;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximizingXOR {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine().trim());
		int M = Integer.parseInt(br.readLine().trim());
		int max = 0;
		for(int i = L; i < M; i++){
			for(int j = L+1; j <= M; j++){
				int xor = i ^ j;
				if(xor > max)
					max = xor;
			}
		}
		System.out.println(max);

	}

}
