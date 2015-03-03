package codeforces.Round_293_Div2.B_Tanya_and_Postcard;

import org.testng.annotations.Test;
import utils.OutputGrabber;

import static codeforces.Round_293_Div2.B_Tanya_and_Postcard.Solution.parseSolveAndPrint;
import static org.testng.Assert.assertEquals;
import static utils.Utils.toStream;

public class SolutionTest {
    @Test
    public void test1() {
        OutputGrabber grabber = new OutputGrabber();

        parseSolveAndPrint(toStream(
                "AbC\n" +
                        "DCbA"), grabber.writer());

        assertEquals(grabber.content(),
                "3 0\n");
    }

    @Test
    public void test2() {
        OutputGrabber grabber = new OutputGrabber();

        parseSolveAndPrint(toStream(
                "ABC\n" +
                        "abc"), grabber.writer());

        assertEquals(grabber.content(),
                "0 3\n");
    }

    @Test
    public void test3() {
        OutputGrabber grabber = new OutputGrabber();

        parseSolveAndPrint(toStream(
                "abacaba\n" +
                        "AbaCaBA"), grabber.writer());

        assertEquals(grabber.content(),
                "3 4\n");
    }
}