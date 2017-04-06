package com.hacker.rank;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {

    public static void solve(int n) {
        int d = n/1000;

        while(d > 99) {
            String s = String.valueOf(d);
            int res = Integer.parseInt(s + new StringBuilder(s).reverse().toString());
            if (res > n) {
                d--;
                continue;
            }
            for(int i = 101; i < 1000; i++) {
                int a = res/i;
                if(a*i == res && a>99 && a<1000) {
                    System.out.println(res);
                    d=99;
                    break;
                }
            }
            d--;
        }
    }

    public static boolean isPrime(int n) {
        if(n < 2) return false;
        if(n==2) return true;
        if(n%2 == 0) return false;
        for(int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n%i == 0) return false;
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve(800000);
	}

}
