package sherlock_and_gcd;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            int[] a = new int[N];
            for (int j = 0; j < N; j++) {
                a[j] = scanner.nextInt();
            }

            System.out.println(solve(a) ? "YES" : "NO");
        }
    }

    public static boolean solve(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (gcd(a[i], a[j]) == 1) {
                    return true;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (isSimple(a[i])) {
                return true;
            }
        }

        return false;
    }

    private static boolean isSimple(int a) {
        if (a == 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0)
                return false;
        }

        return true;
    }

    private static int gcd(int a, int b) {
        while (b > 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }

        return a;
    }
}