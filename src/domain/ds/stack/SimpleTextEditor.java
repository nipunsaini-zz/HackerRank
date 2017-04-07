package domain.ds.stack;

import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = "";
        Stack<String> stack = new Stack<String>();
        stack.push(s);
        int n = scan.nextInt();
        for(int i = 0; i < n; i++) {
            int q = scan.nextInt();
            if (q == 1) {
                String str = scan.next();
                s = s + str;
                stack.push(s);
            } else if (q == 2) {
                int k = scan.nextInt();
                s = s.substring(0, s.length()-k);
                stack.push(s);
            } else if (q == 3) {
                int k = scan.nextInt();
                System.out.println(s.charAt(k-1));
            } else {
                stack.pop();
                s = stack.peek();
            }
        }
    }
}
