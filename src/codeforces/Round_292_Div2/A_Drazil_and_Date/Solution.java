package codeforces.Round_292_Div2.A_Drazil_and_Date;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        parseSolveAndPrint(System.in, System.out);
    }

    public static void parseSolveAndPrint(InputStream in, PrintStream out) {
        Scanner scanner = new Scanner(in);

        long a, b, s;
        a = scanner.nextLong();
        b = scanner.nextLong();
        s = scanner.nextLong();

        long ans = s - Math.abs(a) - Math.abs(b);

        if (ans >= 0 && ans % 2 == 0) {
            out.println("Yes");
        } else {
            out.println("No");
        }
    }
}
