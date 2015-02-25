package codeforces.Round_292_Div2.B_Drazil_and_His_Happy_Friends;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        parseSolveAndPrint(System.in, System.out);
    }

    public static void parseSolveAndPrint(InputStream in, PrintStream out) {
        Scanner scanner = new Scanner(in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int b = scanner.nextInt();
        boolean[] boys = new boolean[n];

        for (int i = 0; i < b; i++) {
            boys[scanner.nextInt()] = true;
        }

        int g = scanner.nextInt();
        boolean[] girls = new boolean[m];

        for (int i = 0; i < g; i++) {
            girls[scanner.nextInt()] = true;
        }

        for (int i = 0; i < (n + 1) * (m + 1); i++) {
            if (boys[i % n] || girls[i % m]) {
                boys[i % n] = girls[i % m] = true;
            }
        }

        boolean result = true;
        for (boolean boy : boys) {
            result &= boy;
        }
        for (boolean girl : girls) {
            result &= girl;
        }

        out.println(result ? "Yes" : "No");
    }
}
