package codeforces.Round_292_Div2.A_Drazil_and_Date;

import org.testng.annotations.Test;
import utils.OutputGrabber;

import static codeforces.Round_292_Div2.A_Drazil_and_Date.Solution.parseSolveAndPrint;
import static org.testng.Assert.assertEquals;
import static utils.Utils.toStream;

public class SolutionTest {
    @Test
    public void test1() {
        OutputGrabber grabber = new OutputGrabber();

        parseSolveAndPrint(toStream(
                "5 5 11"), grabber.writer());

        assertEquals(grabber.content(),
                "No\n");
    }

    @Test
    public void test2() {
        OutputGrabber grabber = new OutputGrabber();

        parseSolveAndPrint(toStream(
                "10 15 25"), grabber.writer());

        assertEquals(grabber.content(),
                "Yes\n");
    }

    @Test
    public void test3() {
        OutputGrabber grabber = new OutputGrabber();

        parseSolveAndPrint(toStream(
                "0 5 1"), grabber.writer());

        assertEquals(grabber.content(),
                "No\n");
    }

    @Test
    public void test4() {
        OutputGrabber grabber = new OutputGrabber();

        parseSolveAndPrint(toStream(
                "0 0 2"), grabber.writer());

        assertEquals(grabber.content(),
                "Yes\n");
    }

    @Test
    public void test5() {
        OutputGrabber grabber = new OutputGrabber();

        parseSolveAndPrint(toStream(
                "-1 0 3"), grabber.writer());

        assertEquals(grabber.content(),
                "Yes\n");
    }
}