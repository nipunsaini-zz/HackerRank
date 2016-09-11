package domain.java.datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            list.add(scan.nextInt());
        }
        int Q = scan.nextInt();
        for (int i = 0; i < Q; i++) {
            String query = scan.next();
            if (query.equals("Insert")) {
                list.add(scan.nextInt(), scan.nextInt());
            }
            if (query.equals("Delete")) {
                list.remove(scan.nextInt());
            }
        }
        for (int a : list) {
            System.out.print(a + " ");
        }
    }
}
