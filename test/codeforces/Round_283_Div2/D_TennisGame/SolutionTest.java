package codeforces.Round_283_Div2.D_TennisGame;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.OutputGrabber;
import utils.Utils;

@Test
public class SolutionTest {

    @Test
    public void firstTest() {
        OutputGrabber grabber = new OutputGrabber();

        Solution.parseSolveAndPrint(Utils.toStream(
                                    "5\n" +
                                    "1 2 1 2 1\n"), grabber.writer());

        Assert.assertEquals(grabber.content(),
                "2\n" +
                "1 3\n" +
                "3 1\n");
    }
}