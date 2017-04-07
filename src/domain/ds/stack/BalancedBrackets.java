package domain.ds.stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();

            Stack<Character> stack = new Stack<Character>();
            boolean flag = false;
            int i;
            for(i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if(ch == '{' || ch == '(' || ch == '[') {
                    stack.push(ch);
                    continue;
                } else {
                    if(stack.empty()){
                        flag = false;
                        break;
                    } else {
                        char c = stack.pop().charValue();
                        if ((ch == '}' && c != '{') || (ch == ')' && c != '(') || (ch == ']' && c != '[')) {
                            flag = false;
                            break;
                        }
                    }
                }
            }
            if(stack.empty() && i == s.length()) {
                flag = true;
            }
            if(flag)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
    }
}
