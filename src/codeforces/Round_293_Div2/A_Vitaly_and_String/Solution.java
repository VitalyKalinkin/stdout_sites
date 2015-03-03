package codeforces.Round_293_Div2.A_Vitaly_and_String;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public final class Solution {

    public static void main(String[] args) {
        parseSolveAndPrint(System.in, System.out);
    }

    public static void parseSolveAndPrint(InputStream in, PrintStream out) {
        Scanner scanner = new Scanner(in);

        String s = scanner.next();
        String t = scanner.next();

        int carry = 1;
        char[] sChar = s.toCharArray();

        for (int i = sChar.length - 1; i >= 0; i--) {
            sChar[i] += carry;

            if (sChar[i] > 'z') {
                sChar[i] = 'a';
                carry = 1;
            } else {
                carry = 0;
            }
        }

        String newS = new String(sChar);

        out.println(newS.compareTo(t) < 0 ? newS : "No such string");
    }
}