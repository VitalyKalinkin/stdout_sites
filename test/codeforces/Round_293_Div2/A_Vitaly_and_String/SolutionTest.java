package codeforces.Round_293_Div2.A_Vitaly_and_String;

import org.testng.annotations.Test;
import utils.OutputGrabber;

import static codeforces.Round_293_Div2.A_Vitaly_and_String.Solution.parseSolveAndPrint;
import static org.testng.Assert.assertEquals;
import static utils.Utils.toStream;

public class SolutionTest {
    @Test
    public void test1() {
        OutputGrabber grabber = new OutputGrabber();

        parseSolveAndPrint(toStream(
                "a\n" +
                        "c"), grabber.writer());

        assertEquals(grabber.content(),
                "b\n");
    }

    @Test
    public void test2() {
        OutputGrabber grabber = new OutputGrabber();

        parseSolveAndPrint(toStream(
                "aaa\n" +
                        "zzz"), grabber.writer());

        assertEquals(grabber.content(),
                "aab\n");
    }

    @Test
    public void test3() {
        OutputGrabber grabber = new OutputGrabber();

        parseSolveAndPrint(toStream(
                "abcdefg\n" +
                        "abcdefh"), grabber.writer());

        assertEquals(grabber.content(),
                "No such string\n");
    }

    @Test
    public void test4() {
        OutputGrabber grabber = new OutputGrabber();

        parseSolveAndPrint(toStream(
                "abcdefg\n" +
                        "abcdefi"), grabber.writer());

        assertEquals(grabber.content(),
                "abcdefh\n");
    }

    @Test
    public void test5() {
        OutputGrabber grabber = new OutputGrabber();

        parseSolveAndPrint(toStream(
                "abcdezz\n" +
                        "abcdgzz"), grabber.writer());

        assertEquals(grabber.content(),
                "abcdfaa\n");
    }


    @Test
    public void test6() {
        OutputGrabber grabber = new OutputGrabber();

        parseSolveAndPrint(toStream(
                "abcdezz\n" +
                        "abcdfaa"), grabber.writer());

        assertEquals(grabber.content(),
                "No such string\n");
    }
}