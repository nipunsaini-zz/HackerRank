package domain.ds.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int q = scan.nextInt();
        int lastAns = 0;
        ArrayList<Integer>[] array = (ArrayList<Integer>[]) new ArrayList[n];

        for(int i = 0; i < n; i++) {
            array[i] = new ArrayList<>();
        }

        for(int i = 0; i < q; i++) {
            int query = scan.nextInt();
            int x = scan.nextInt();
            int y = scan.nextInt();
            int seq = (x ^ lastAns) % n;
            if (query == 1) {
                array[seq].add(y);
            } else {
                ArrayList<Integer> list = array[seq];
                lastAns = list.get(y % list.size());
                System.out.println(lastAns);
            }

        }
    }
}
