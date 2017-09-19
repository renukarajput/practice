package geeks.test;


import geeks.programs.OddEvenDifference;
import org.junit.Test;

public class OddEvenDifferenceTest {

    OddEvenDifference oddEvenDifferenceObj = new OddEvenDifference();

    @Test
    public void input1() {
        oddEvenDifferenceObj.findOddEvenDiff(1212112);   // 1 2 1 2 1 1 2
    }
}
