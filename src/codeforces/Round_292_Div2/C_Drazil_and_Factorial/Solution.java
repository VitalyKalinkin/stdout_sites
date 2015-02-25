package codeforces.Round_292_Div2.C_Drazil_and_Factorial;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public final class Solution {

    // 2 -> 2!
    // 3 -> 3!
    // 4 -> 3!2!2!
    // 5 -> 5!
    // 6 -> 5!3!
    // 7 -> 7!
    // 8 -> 7!2!2!2!
    // 9 -> 7!3!3!2!
    public static void main(String[] args) {
        parseSolveAndPrint(System.in, System.out);
    }

    private static final Map<Character, String> map = new HashMap<Character, String>(){{
        put('0', "");
        put('1', "");
        put('2', "2");
        put('3', "3");
        put('4', "322");
        put('5', "5");
        put('6', "53");
        put('7', "7");
        put('8', "7222");
        put('9', "7332");
    }};

    public static void parseSolveAndPrint(InputStream in, PrintStream out) {
        Scanner scanner = new Scanner(in);

        int n = scanner.nextInt();
        String number = scanner.next();
        ArrayList<Character> result = new ArrayList<>();

        for (char ch : number.toCharArray()) {
            for (char chResult : map.get(ch).toCharArray()) {
                result.add(chResult);
            }
        }

        Collections.sort(result, (ch1, ch2) -> Character.compare(ch2, ch1));
        StringBuilder output = new StringBuilder();
        result.stream().forEach(output::append);

        out.println(output);
    }
}