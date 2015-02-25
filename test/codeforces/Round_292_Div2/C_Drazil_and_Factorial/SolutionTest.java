package codeforces.Round_292_Div2.C_Drazil_and_Factorial;

import org.testng.annotations.Test;
import utils.OutputGrabber;

import static codeforces.Round_292_Div2.C_Drazil_and_Factorial.Solution.parseSolveAndPrint;
import static org.testng.Assert.assertEquals;
import static utils.Utils.toStream;

public class SolutionTest {

    @Test
    public void test1() {
        OutputGrabber grabber = new OutputGrabber();

        parseSolveAndPrint(toStream(
                "4\n" +
                        "1234"), grabber.writer());

        assertEquals(grabber.content(),
                "33222\n");
    }

    @Test
    public void test2() {
        OutputGrabber grabber = new OutputGrabber();

        parseSolveAndPrint(toStream(
                "3\n" +
                        "555"), grabber.writer());

        assertEquals(grabber.content(),
                "555\n");
    }

    @Test
    public void test3() {
        OutputGrabber grabber = new OutputGrabber();

        parseSolveAndPrint(toStream(
                "3\n" +
                        "987654321"), grabber.writer());

        assertEquals(grabber.content(),
                "77755333332222222\n");
    }

    @Test
    public void test4() {
        OutputGrabber grabber = new OutputGrabber();

        parseSolveAndPrint(toStream(
                "15\n" +
                        "012345781234578"), grabber.writer());

        assertEquals(grabber.content(),
                "7777553333222222222222\n");
    }

}