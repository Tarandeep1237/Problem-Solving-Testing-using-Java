import java.io.*;
import java.util.*;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {

    public static PerformOperation isOdd() {
        return new PerformOperation() {
            public boolean check(int a) {
                return a % 2 != 0;
            }
        };
    }

    public static PerformOperation isPrime() {
        return new PerformOperation() {
            public boolean check(int a) {
                if (a <= 1) return false;
                for (int i = 2; i <= Math.sqrt(a); i++) {
                    if (a % i == 0) return false;
                }
                return true;
            }
        };
    }

    public static PerformOperation isPalindrome() {
        return new PerformOperation() {
            public boolean check(int a) {
                int rev = 0, temp = a;
                while (temp > 0) {
                    rev = rev * 10 + temp % 10;
                    temp /= 10;
                }
                return rev == a;
            }
        };
    }
}

public class Solution {

    public static void main(String[] args) throws Exception {

        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret;

        while (T-- > 0) {
            String[] s = br.readLine().split(" ");
            int ch = Integer.parseInt(s[0]);
            int num = Integer.parseInt(s[1]);

            if (ch == 1) {
                op = ob.isOdd();
                ret = op.check(num);
                System.out.println(ret ? "ODD" : "EVEN");
            }
            else if (ch == 2) {
                op = ob.isPrime();
                ret = op.check(num);
                System.out.println(ret ? "PRIME" : "COMPOSITE");
            }
            else if (ch == 3) {
                op = ob.isPalindrome();
                ret = op.check(num);
                System.out.println(ret ? "PALINDROME" : "NOT PALINDROME");
            }
        }
    }
}
