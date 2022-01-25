package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class WeightedJobSchedulingTest {
    WeightedJobScheduling weightedJobScheduling = new WeightedJobScheduling();

    @Test
    public void maxValue() {
        int[][] jobsArray =
                {{1, 2, 50},
                {3, 5, 20},
                {6, 19, 100},
                {2, 100, 200}};
        List<int[]> jobs=new ArrayList<>();
        for (int[] job:jobsArray){
            jobs.add(job);
        }
        assertThat(weightedJobScheduling.getMaxProfit(jobs),is(250));
    }
}