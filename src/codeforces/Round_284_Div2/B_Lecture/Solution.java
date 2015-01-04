package codeforces.Round_284_Div2.B_Lecture;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public final class Solution {

    public static void main(String[] args) {
        parseSolveAndPrint(System.in, System.out);
    }

    public static void parseSolveAndPrint(InputStream in, PrintStream out) {
        Scanner scanner = new Scanner(in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        Map<String, String> trans = new HashMap<>();

        for (int i = 0; i < m; i++) {
            String a = scanner.next();
            String b = scanner.next();

            if (a.length() > b.length()) {
                trans.put(a, b);
            } else {
                trans.put(a, a);
            }
        }

        for (int i = 0; i < n; i++) {
            String word = scanner.next();
            out.print(trans.get(word));

            if (i + 1 != n)
                out.print(" ");
        }

        out.println();
    }
}