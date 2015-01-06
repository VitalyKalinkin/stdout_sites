package codeforces.Round_284_Div2.C_CrazyTown;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public final class Solution {

    public static void main(String[] args) {
        parseSolveAndPrint(System.in, System.out);
    }

    public static void parseSolveAndPrint(InputStream in, PrintStream out) {
        Scanner scanner = new Scanner(in);

        Point start = new Point(scanner.nextInt(), scanner.nextInt());
        Point finish = new Point(scanner.nextInt(), scanner.nextInt());

        int n = scanner.nextInt();
        Line[] lines = new Line[n];

        for (int i = 0; i < n; i++) {
            lines[i] = new Line(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        }

        int steps = 0;
        for (Line line : lines) {
            if (line.doesIntersectSegment(start, finish))
                steps++;
        }

        out.println(steps);
    }

    private static class Line {
        private double a;
        private double b;
        private double c;

        public Line(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public boolean doesIntersectSegment(Point start, Point finish) {
            double startDistance = a * start.x + b * start.y + c;
            double finishDistance = a * finish.x + b * finish.y + c;

            return startDistance * finishDistance < 0;
        }
    }

    private static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}