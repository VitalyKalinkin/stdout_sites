package codeforces.Round_284_Div2.A_WatchingMovie;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public final class Solution {

    public static void main(String[] args) {
        parseSolveAndPrint(System.in, System.out);
    }

    public static void parseSolveAndPrint(InputStream in, PrintStream out) {
        Scanner scanner = new Scanner(in);

        int n = scanner.nextInt();
        int x = scanner.nextInt();

        int[] l = new int[n];
        int[] r = new int[n];

        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
            r[i] = scanner.nextInt();
        }

        int currentTime = 1;
        int watched = 0;

        for (int i = 0; i < n; i++) {
            if (currentTime + x <= l[i]) {
                currentTime += ((l[i] - currentTime) / x) * x;
            }

            watched += r[i] - currentTime + 1;
            currentTime = r[i] + 1;
        }


        out.println(watched);
    }
}