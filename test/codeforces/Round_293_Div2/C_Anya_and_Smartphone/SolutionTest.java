package codeforces.Round_293_Div2.C_Anya_and_Smartphone;

import org.testng.annotations.Test;
import utils.OutputGrabber;

import static codeforces.Round_293_Div2.C_Anya_and_Smartphone.Solution.parseSolveAndPrint;
import static org.testng.Assert.assertEquals;
import static utils.Utils.toStream;

public class SolutionTest {
    @Test
    public void test1() {
        OutputGrabber grabber = new OutputGrabber();

        parseSolveAndPrint(toStream(
                "8 3 3\n" +
                        "1 2 3 4 5 6 7 8\n" +
                        "7 8 1"), grabber.writer());

        assertEquals(grabber.content(),
                "7\n");
    }

    @Test
    public void test2() {
        OutputGrabber grabber = new OutputGrabber();

        parseSolveAndPrint(toStream(
                "5 4 2\n" +
                        "3 1 5 2 4\n" +
                        "4 4 4 4"), grabber.writer());

        assertEquals(grabber.content(),
                "8\n");
    }
}