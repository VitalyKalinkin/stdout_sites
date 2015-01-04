package codeforces.Round_284_Div2.A_WatchingMovie;

import org.testng.annotations.Test;
import utils.OutputGrabber;

import static codeforces.Round_284_Div2.A_WatchingMovie.Solution.parseSolveAndPrint;
import static org.testng.Assert.assertEquals;
import static utils.Utils.toStream;

@Test
public class SolutionTest {

    @Test
    public void test1() {
        OutputGrabber grabber = new OutputGrabber();

        parseSolveAndPrint(toStream(
                "2 3\n" +
                "5 6\n" +
                "10 12\n"), grabber.writer());

        assertEquals(grabber.content(),
                "6\n");
    }

    @Test
    public void test2() {
        OutputGrabber grabber = new OutputGrabber();

        parseSolveAndPrint(toStream(
                "1 1\n" +
                "1 100000\n"), grabber.writer());

        assertEquals(grabber.content(),
                "100000\n");
    }

    @Test
    public void test3() {
        OutputGrabber grabber = new OutputGrabber();

        parseSolveAndPrint(toStream(
                "2 3\n" +
                "4 6\n" +
                "13 14\n"), grabber.writer());

        assertEquals(grabber.content(),
                "5\n");
    }


}