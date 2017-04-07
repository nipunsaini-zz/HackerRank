package domain.ds.stack;

import java.util.Scanner;
import java.util.Stack;

public class EqualStacks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int h1[] = new int[n1];
        for(int h1_i=0; h1_i < n1; h1_i++){
            h1[h1_i] = in.nextInt();
        }
        int h2[] = new int[n2];
        for(int h2_i=0; h2_i < n2; h2_i++){
            h2[h2_i] = in.nextInt();
        }
        int h3[] = new int[n3];
        for(int h3_i=0; h3_i < n3; h3_i++){
            h3[h3_i] = in.nextInt();
        }
        Stack<Integer> s1 = getStack(h1);
        Stack<Integer> s2 = getStack(h2);
        Stack<Integer> s3 = getStack(h3);
        int height = 0;
        while(true) {
            if(s1.empty()) {
                break;
            }
            if(s2.search(s1.peek()) != -1 && s3.search(s1.peek()) != -1) {
                height = s1.peek();
                break;
            } else {
                s1.pop();
            }
        }
        System.out.println(height);

    }

    public static Stack<Integer> getStack(int[] arr) {
        int sum = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = arr.length-1; i>=0; i--) {
            sum += arr[i];
            stack.push(sum);
        }
        return stack;
    }
}
