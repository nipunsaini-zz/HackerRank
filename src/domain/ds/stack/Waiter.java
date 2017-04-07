package domain.ds.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Waiter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int q = scan.nextInt();
        List<Stack<Integer>> a = new ArrayList<Stack<Integer>>();
        List<Stack<Integer>> b = new ArrayList<Stack<Integer>>();
        List<Integer> primes = new ArrayList<Integer>();
        a.add(new Stack<Integer>());
        for(int i = 0; i < n; i++) {
            a.get(0).push(scan.nextInt());
        }

        for(int i = 0; i < q; i++) {
            if (primes.size() < i+1) {
                primes = getUpdatedPrimes(primes, i+1);
            }
            int prime = primes.get(i);
            b.add(i, new Stack<Integer>());
            a.add(i+1, new Stack<Integer>());
            while (!a.get(i).isEmpty()) {
                int num = a.get(i).pop();
                if (num % prime == 0)
                    b.get(i).push(num);
                else
                    a.get(i+1).push(num);
            }
        }
        for (int j = 0; j < q; j++) {
            while(!b.get(j).isEmpty()) {
                System.out.println(b.get(j).pop());
            }
        }
        while (!a.get(q).isEmpty()) {
            System.out.println(a.get(q).pop());
        }
    }

    public static List<Integer> getUpdatedPrimes(List<Integer> list, int n) {
        int c = (list.size() == 0) ? 2 : list.get(list.size()-1)+1;
        for(int i = c; list.size() != n; i++) {
            boolean prime = true;
            for (int x : list) {
                if (i % x == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime)
                list.add(i);
        }
        return list;
    }
}
