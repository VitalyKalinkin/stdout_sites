package codeforces.Round_292_Div2.B_Drazil_and_His_Happy_Friends;

import org.testng.annotations.Test;
import utils.OutputGrabber;

import static codeforces.Round_292_Div2.B_Drazil_and_His_Happy_Friends.Solution.parseSolveAndPrint;
import static org.testng.Assert.assertEquals;
import static utils.Utils.toStream;

public class SolutionTest {
    @Test
    public void test1() {
        OutputGrabber grabber = new OutputGrabber();

        parseSolveAndPrint(toStream(
                "2 3\n" +
                "0\n" +
                "1 0"), grabber.writer());

        assertEquals(grabber.content(),
                "Yes\n");
    }

    @Test
    public void test2() {
        OutputGrabber grabber = new OutputGrabber();

        parseSolveAndPrint(toStream(
                "2 4\n" +
                        "1 0\n" +
                        "1 2"), grabber.writer());

        assertEquals(grabber.content(),
                "No\n");
    }

    @Test
    public void test3() {
        OutputGrabber grabber = new OutputGrabber();

        parseSolveAndPrint(toStream(
                "2 3\n" +
                        "1 0\n" +
                        "1 1"), grabber.writer());

        assertEquals(grabber.content(),
                "Yes\n");
    }

    @Test
    public void test4() {
        OutputGrabber grabber = new OutputGrabber();

        parseSolveAndPrint(toStream(
                "3 20\n" +
                        "0\n" +
                        "1 19"), grabber.writer());

        assertEquals(grabber.content(),
                "Yes\n");
    }


}