package codeforces.Round_293_Div2.B_Tanya_and_Postcard;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public final class Solution {

    public static void main(String[] args) {
        parseSolveAndPrint(System.in, System.out);
    }

    public static void parseSolveAndPrint(InputStream in, PrintStream out) {
        Scanner scanner = new Scanner(in);

        String s = scanner.next();
        String t = scanner.next();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            map.put(ch, 0);
            map.put(Character.toUpperCase(ch), 0);
        }

        for (char ch : t.toCharArray()) {
            map.put(ch, map.get(ch) + 1);
        }

        int yay = 0;
        int whoops = 0;
        ArrayList<Character> leftChars = new ArrayList<>();

        for (char ch : s.toCharArray()) {
            if (map.get(ch) > 0) {
                yay++;
                map.put(ch, map.get(ch) - 1);
            } else {
                leftChars.add(ch);
            }
        }

        for (char ch : leftChars) {
            char invCh = invertCase(ch);
            if (map.get(invCh) > 0) {
                whoops++;
                map.put(invCh, map.get(invCh) - 1);
            }
        }

        out.println(yay + " " + whoops);
    }

    private static char invertCase(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return Character.toUpperCase(ch);
        } else {
            return Character.toLowerCase(ch);
        }
    }
}