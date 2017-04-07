package domain.ds.stack;

import java.util.Scanner;
import java.util.Stack;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<String> stack = new Stack<String>();
        int max = 0;
        int n = scan.nextInt();
        for(int i = 0; i < n; i++) {
            int t = scan.nextInt();
            if(t == 1) {
                int m = scan.nextInt();
                if(max < m) max = m;
                stack.push(m + "-" + max);
            } else if(t==2) {
                stack.pop();
                if(!stack.isEmpty()){
                    String str = stack.peek();
                    String temp = str.substring(str.indexOf("-")+1);
                    max = Integer.parseInt(temp);
                } else {
                    max = 0;
                }
            } else {
                String str = stack.peek();
                String temp = str.substring(str.indexOf("-")+1);
                System.out.println(temp);
            }
        }
    }
}
