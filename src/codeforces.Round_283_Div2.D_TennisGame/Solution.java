package codeforces.Round_283_Div2.D_TennisGame;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        parseSolveAndPrint(System.in, System.out);
    }

    public static void parseSolveAndPrint(InputStream in, PrintStream out) {
        Scanner scanner = new Scanner(in);

        int n = scanner.nextInt();
        int[] a = new int[n];

        List<Integer> firstPosition = new ArrayList<>();
        List<Integer> secondPosition = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt() - 1;

            if (a[i] == 0) {
                firstPosition.add(i);
            } else {
                secondPosition.add(i);
            }
        }

        List<Pair> result = new ArrayList<>();

        for (int t = 1; t <= n; t++) {
            int firstCurrentIndex = 0;
            int secondCurrentIndex = 0;
            int firstSets = 0;
            int secondSets = 0;

            while (true) {
                int firstIndexAfterTSteps = firstCurrentIndex + t;
                int secondIndexAfterTSteps = secondCurrentIndex + t;

                int firstPositionAfterTSteps =
                        firstIndexAfterTSteps > firstPosition.size() ? Integer.MAX_VALUE : firstPosition.get(firstIndexAfterTSteps - 1);
                int secondPositionAfterTSteps =
                        secondIndexAfterTSteps > secondPosition.size() ? Integer.MAX_VALUE : secondPosition.get(secondIndexAfterTSteps - 1);

                if (firstPositionAfterTSteps == secondPositionAfterTSteps) {
                    break;
                } else if (firstPositionAfterTSteps < secondPositionAfterTSteps) {
                    firstSets++;
                    firstCurrentIndex = firstIndexAfterTSteps;
                    secondCurrentIndex = findLowerBound(secondPosition, firstPositionAfterTSteps);
                } else {
                    secondSets++;
                    secondCurrentIndex = secondIndexAfterTSteps;
                    firstCurrentIndex = findLowerBound(firstPosition, secondPositionAfterTSteps);
                }
            }

            if (firstSets != secondSets
                    && firstCurrentIndex == firstPosition.size()
                    && secondCurrentIndex == secondPosition.size()) {
                int lastMove = a[a.length - 1];
                if ((firstSets > secondSets && lastMove == 0)
                        || (secondSets > firstSets && lastMove == 1)) {
                    result.add(new Pair(Math.max(firstSets, secondSets), t));
                }
            }
        }

        result = result.stream().sorted((x, y) -> {
            int compResult = Integer.compare(x.s, y.s);
            if (compResult == 0)
                return Integer.compare(x.t, y.t);
            return compResult;
        }).collect(Collectors.toList());

        out.println(result.size());
        for (Pair pair : result) {
            out.println(pair.s + " " + pair.t);
        }
    }

    private static int findLowerBound(List<Integer> positions, int value) {
        int lo = 0;
        int hi = positions.size() - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (value > positions.get(mid)) {
                lo = mid + 1;
            } else if (value < positions.get(mid)) {
                hi = mid - 1;
            } else {
                return mid;
            }
        }

        return lo;
    }

    public static class Pair {
        public int s;
        public int t;

        public Pair(int s, int t) {
            this.s = s;
            this.t = t;
        }
    }
}