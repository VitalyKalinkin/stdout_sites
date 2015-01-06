package codeforces.Round_284_Div2.C_CrazyTown;

import org.testng.annotations.Test;
import utils.OutputGrabber;

import static codeforces.Round_284_Div2.C_CrazyTown.Solution.parseSolveAndPrint;
import static org.testng.Assert.assertEquals;
import static utils.Utils.toStream;

@Test
public class SolutionTest {

    @Test
    public void test1() {
        OutputGrabber grabber = new OutputGrabber();

        parseSolveAndPrint(toStream(
                "1 1\n" +
                        "-1 -1\n" +
                        "2\n" +
                        "0 1 0\n" +
                        "1 0 0"), grabber.writer());

        assertEquals(grabber.content(),
                "2\n");
    }

    @Test
    public void test2() {
        OutputGrabber grabber = new OutputGrabber();

        parseSolveAndPrint(toStream(
                "1 1\n" +
                "-1 -1\n" +
                "3\n" +
                "1 0 0\n" +
                "0 1 0\n" +
                "1 1 -3"), grabber.writer());

        assertEquals(grabber.content(),
                "2\n");
    }

    @Test
    public void test3() {
        OutputGrabber grabber = new OutputGrabber();

        parseSolveAndPrint(toStream(
                "0 0\n" +
                        "2 3\n" +
                        "3\n" +
                        "2 2 -4\n" +
                        "4 4 -16\n" +
                        "6 6 -36"), grabber.writer());

        assertEquals(grabber.content(),
                "2\n");
    }

    @Test
    public void test4() {
        OutputGrabber grabber = new OutputGrabber();

        parseSolveAndPrint(toStream(
                "753007 47508\n" +
                "-404431 485623\n" +
                "20\n" +
                "-659223 759624 411530\n" +
                "-265907 -409279 -677879\n" +
                "-2840 581359 784346\n" +
                "-321544 -214764 991265\n" +
                "-739187 921619 -512826\n" +
                "-683253 -519797 -891884\n" +
                "-722708 -254998 -285022\n" +
                "-3402 894059 -334131\n" +
                "-318500 -181524 459870\n" +
                "-246644 -655665 -894218\n" +
                "-937971 705141 956401\n" +
                "-369463 90106 -510400\n" +
                "-173528 899349 112340\n" +
                "-536906 277129 -898112\n" +
                "-718432 -179956 -965432\n" +
                "-74461 767826 564170\n" +
                "-170127 122758 316194\n" +
                "-927815 -351805 918341\n" +
                "-386612 765383 998803\n" +
                "-339874 -803968 -812657\n"), grabber.writer());

        assertEquals(grabber.content(),
                "15\n");
    }


}