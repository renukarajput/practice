package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class EqualAveragePartitionTest {
    EqualAveragePartition averagePartition=new EqualAveragePartition();

    @Test
    public void partition() {
        final ArrayList<Integer>[] partition = averagePartition.partition(Arrays.asList(1, 7, 15, 29, 11, 9));
        System.out.println(partition[0]);
        System.out.println(partition[1]);
    }
}