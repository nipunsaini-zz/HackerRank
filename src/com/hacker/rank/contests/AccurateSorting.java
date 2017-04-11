package com.hacker.rank.contests;

import java.util.Scanner;

public class AccurateSorting {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();

        for(int i = 0; i < q; i++) {
            int n = scan.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scan.nextInt();
            }
            boolean swap;
            for (int k = 0; k < n-1; k++) {
                swap = false;
                for (int a = 0; a < n-k-1; a++) {
                    if (arr[a] > arr[a+1] && Math.abs(arr[a] - arr[a+1]) == 1) {
                        int temp = arr[a];
                        arr[a] = arr[a+1];
                        arr[a+1] = temp;
                        swap = true;
                    }
                }
                if (!swap) break;
            }

            boolean isSorted = true;
            for (int k = 0; k < n-1; k++) {
                if (arr[k] > arr[k+1]) {
                    isSorted = false;
                    break;
                }
            }
            if (isSorted)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
