package edu.leetcode.array;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MergeIntervalsTest {

    @Test
    public void merge() {
        int[][] inputIntervals={{1,6},{3,7},{9,10}};
        int[][] expected={{1,7},{9,10}};
        int[][] merged = new MergeIntervals().merge(inputIntervals);
        int[] i=new int[]{0};
        Arrays.stream(merged).forEach(arr-> System.out.println(Arrays.toString(arr)));
        assertThat(merged.length,is(expected.length));
       Arrays.stream(merged).forEach(arr-> assertThat(expected[i[0]++],is(arr)));
    }

    @Test
    public void merge01() {
        int[][] inputIntervals={{1,4},{2,3}};
        int[][] expected={{1,4}};
        int[][] merged = new MergeIntervals().merge(inputIntervals);
        int[] i=new int[]{0};
        Arrays.stream(merged).forEach(arr-> System.out.println(Arrays.toString(arr)));
        assertThat(merged.length,is(expected.length));
        Arrays.stream(merged).forEach(arr-> assertThat(expected[i[0]++],is(arr)));
    }

    @Test
    public void merge02() {
        int[][] inputIntervals={{2,3},{4,5},{6,7},{8,9},{1,10}};
        int[][] expected={{1,10}};
        int[][] merged = new MergeIntervals().merge(inputIntervals);
        int[] i=new int[]{0};
        Arrays.stream(merged).forEach(arr-> System.out.println(Arrays.toString(arr)));
        assertThat(merged.length,is(expected.length));
        Arrays.stream(merged).forEach(arr-> assertThat(expected[i[0]++],is(arr)));
    }



    @Test
    public void merge03() {
        int[][] inputIntervals={{2,3},{4,5},{1,10},{6,7},{8,9}};
        int[][] expected={{1,10}};
        int[][] merged = new MergeIntervals().merge(inputIntervals);
        int[] i=new int[]{0};
        Arrays.stream(merged).forEach(arr-> System.out.println(Arrays.toString(arr)));
        assertThat(merged.length,is(expected.length));
        Arrays.stream(merged).forEach(arr-> assertThat(expected[i[0]++],is(arr)));
    }


    @Test
    public void merge04() {
        int[][] inputIntervals={{2,3},{4,5},{1,10},{16,17},{15,17}};
        int[][] expected={{1,10},{15,17}};
        int[][] merged = new MergeIntervals().merge(inputIntervals);
        int[] i=new int[]{0};
        Arrays.stream(merged).forEach(arr-> System.out.println(Arrays.toString(arr)));
        assertThat(merged.length,is(expected.length));
        Arrays.stream(merged).forEach(arr-> assertThat(expected[i[0]++],is(arr)));
    }

    @Test
    public void merge05() {
        int[][] inputIntervals={{1,3},{2,5}};
        int[][] expected={{1,5}};
        int[][] merged = new MergeIntervals().merge(inputIntervals);
        int[] i=new int[]{0};
        Arrays.stream(merged).forEach(arr-> System.out.println(Arrays.toString(arr)));
        assertThat(merged.length,is(expected.length));
        Arrays.stream(merged).forEach(arr-> assertThat(expected[i[0]++],is(arr)));
    }

    @Test
    public void merge06() {
        int[][] inputIntervals={{0,0},{1,2},{5,5},{2,4},{3,3},{5,6},{5,6},{4,6},{0,0},{1,2},{0,2},{4,5}};
        int[][] expected={{0,6}};
        int[][] merged = new MergeIntervals().merge(inputIntervals);
        int[] i=new int[]{0};
        Arrays.stream(merged).forEach(arr-> System.out.println(Arrays.toString(arr)));
        assertThat(merged.length,is(expected.length));
        Arrays.stream(merged).forEach(arr-> assertThat(expected[i[0]++],is(arr)));
    }



    @Test
    public void merge07() {
        int[][] inputIntervals={{0,0},{1,2},{5,5},{2,4},{5,6},{0,2},{4,6}};
        int[][] expected={{0,6}};
        int[][] merged = new MergeIntervals().merge(inputIntervals);
        int[] i=new int[]{0};
        Arrays.stream(merged).forEach(arr-> System.out.println(Arrays.toString(arr)));
        assertThat(merged.length,is(expected.length));
        Arrays.stream(merged).forEach(arr-> assertThat(expected[i[0]++],is(arr)));
    }

}