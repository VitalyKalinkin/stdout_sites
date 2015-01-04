package codeforces.Round_283_Div2.D_TennisGame;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.OutputGrabber;
import utils.Utils;

@Test
public class SolutionTest {

    @Test
    public void test1() {
        OutputGrabber grabber = new OutputGrabber();

        Solution.parseSolveAndPrint(Utils.toStream(
                                    "5\n1 2 1 2 1\n"), grabber.writer());

        Assert.assertEquals(grabber.content(),
                "2\n" +
                        "1 3\n" +
                        "3 1\n");
    }

    @Test
    public void test2() {
        OutputGrabber grabber = new OutputGrabber();

        Solution.parseSolveAndPrint(Utils.toStream(
                "4\n1 1 1 1\n"), grabber.writer());

        Assert.assertEquals(grabber.content(),
                "3\n" +
                "1 4\n" +
                "2 2\n" +
                "4 1\n");
    }

    @Test
    public void test3() {
        OutputGrabber grabber = new OutputGrabber();

        Solution.parseSolveAndPrint(Utils.toStream(
                "4\n1 2 1 2\n"), grabber.writer());

        Assert.assertEquals(grabber.content(),
                "0\n");
    }

    @Test
    public void test4() {
        OutputGrabber grabber = new OutputGrabber();

        Solution.parseSolveAndPrint(Utils.toStream(
                "8\n2 1 2 1 1 1 1 1\n"), grabber.writer());

        Assert.assertEquals(grabber.content(),
                "3\n" +
                "1 6\n" +
                "2 3\n" +
                "6 1\n");
    }
}