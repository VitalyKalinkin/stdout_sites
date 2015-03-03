package codeforces.Round_293_Div2.C_Anya_and_Smartphone;

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
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt() - 1;
        }

        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt() - 1;
        }

        int[] indexes = new int[n];

        for (int i = 0; i < n; i++) {
            indexes[a[i]] = i;
        }

        long result = 0;

        for (int bItem : b) {
            int ind = indexes[bItem];

            result += ind / k + 1;

            if (ind > 0) {
                int prev = a[ind - 1];
                swap(a, ind, ind - 1);
                indexes[bItem] = ind - 1;
                indexes[prev] = ind;
            }
        }

        out.println(result);
    }

    private static void swap(int[] ar, int i, int j) {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
}