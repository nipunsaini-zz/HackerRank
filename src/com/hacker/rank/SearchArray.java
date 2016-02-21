package com.hacker.rank;

import java.util.Scanner;

public class SearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i =0; i < T; i++){
			int N = scan.nextInt();
			int[] arr = new int[N];
			int sum = 0;
			for(int j = 0; j < N; j++){
				arr[j] = scan.nextInt();
				sum += arr[j];
			}
			int leftSum = 0;
			int rightSum = sum;
			boolean isEqual = false;
			for(int number : arr){
				rightSum -= number;
				if(leftSum == rightSum){
					isEqual = true;
					break;
				}
				leftSum += number;
			}
			if(isEqual)
				System.out.println("YES");
			else
			System.out.println("NO");
		}

	}

}
