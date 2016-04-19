package domain.algo.bits;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FlippingBits {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		for(int i = 0; i < T; i++){
			int res = ~ Integer.parseInt(br.readLine());
			System.out.println(Long.toString(res & 0xFFFFFFFFL));
		}

	}

}
