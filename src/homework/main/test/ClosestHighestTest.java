package homework.main.test;

import homework.main.java.ClosestHighest;
import org.junit.Test;

public class ClosestHighestTest {

    @Test
    public void closestHighestInput1(){
        int[] inputArr = {4, 2, 3, 1, 5, 10};
        ClosestHighest.getClosestHighestNumber(inputArr);
    }

    @Test
    public void closestHighestInput2(){
        int[] inputArr = {1, 0, 1, -1, 5};
        ClosestHighest.getClosestHighestNumber(inputArr);
    }

    @Test
    public void closestHighestInput3(){
        int[] inputArr = {-3 ,0 ,-1, 0, -5};
        ClosestHighest.getClosestHighestNumber(inputArr);
    }
}
