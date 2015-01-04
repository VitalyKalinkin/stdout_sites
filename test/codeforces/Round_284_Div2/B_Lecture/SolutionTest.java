package codeforces.Round_284_Div2.B_Lecture;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.OutputGrabber;
import utils.Utils;

import static codeforces.Round_284_Div2.B_Lecture.Solution.parseSolveAndPrint;
import static org.testng.Assert.assertEquals;
import static utils.Utils.toStream;

public class SolutionTest {
    @Test
    public void test1() {
        OutputGrabber grabber = new OutputGrabber();

        parseSolveAndPrint(toStream(
                "4 3\n" +
                "codeforces codesecrof\n" +
                "contest round\n" +
                "letter message\n" +
                "codeforces contest letter contest\n"), grabber.writer());

        assertEquals(grabber.content(),
                "codeforces round letter round\n");
    }

    @Test
    public void test2() {
        OutputGrabber grabber = new OutputGrabber();

        parseSolveAndPrint(Utils.toStream(
                "5 3\n" +
                "joll wuqrd\n" +
                "euzf un\n" +
                "hbnyiyc rsoqqveh\n" +
                "hbnyiyc joll joll euzf joll"), grabber.writer());

        Assert.assertEquals(grabber.content(),
                "hbnyiyc joll joll un joll\n");
    }


}