package domain.java.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

interface PerformOperation {
    boolean check(int a);
}
class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }
    // Write your code here
    public PerformOperation is_odd() {
        return (x) -> (x % 2) == 0 ? false : true;
    }

    public PerformOperation is_prime() {
        PerformOperation p = x -> {
            if (x == 1) return true;
            for (int i = 2; i <= x/2; i++) {
                if (x % i == 0)
                    return false;
            }
            return true;
        };
        return p;
    }

    public PerformOperation is_palindrome() {
        PerformOperation p = x -> {
            int rev = 0, temp = x;
            while (temp > 0) {
                int rem = temp % 10;
                rev = (rev*10) + rem;
                temp /= 10;
            }
            return (x == rev) ? true : false;
        };
        return p;
    }
}

public class JavaLambdaExpressions {
    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T--> 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.is_odd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.is_prime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.is_palindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}
