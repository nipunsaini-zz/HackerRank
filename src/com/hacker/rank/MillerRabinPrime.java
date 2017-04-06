package com.hacker.rank;

import java.util.concurrent.ThreadLocalRandom;

public class MillerRabinPrime {

    public static boolean isPrime(long n, int k) {
        // 1. write n − 1 as 2^r·d with d odd by factoring powers of 2 from n − 1
        long d = n-1;
        int r = 0;
        while(d % 2 == 0) {
            r++;
            d /= 2;
        }

        // 2. repeat k times
        for (int i = 0; i < k; i++) {
            boolean flag = false;
            long a = ThreadLocalRandom.current().nextLong(2, n - 1);
            long x = (long)Math.pow(a, d) % n;
            if (x == 1 || x == n-1)
                continue;
            for (int j = 0; j < r-1; j++) {
                x = (x*x) % n;
                if (x == 1)
                    return false;
                if (x == n-1) {
                    flag = true;
                    break;
                }
            }
            if (flag) continue;
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(9, 3));
        System.out.println(isPrime(23, 3));
        System.out.println(isPrime(97, 3));
        System.out.println(isPrime(43, 11));
    }
}
