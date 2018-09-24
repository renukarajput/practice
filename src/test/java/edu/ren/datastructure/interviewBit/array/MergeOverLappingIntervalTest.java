package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MergeOverLappingIntervalTest {

    @Test
    public void merge() {
        ArrayList<MergeOverLappingInterval.Interval> input=new ArrayList<>();
        input.add(new MergeOverLappingInterval.Interval(new int[]{1,3}));
        input.add(new MergeOverLappingInterval.Interval(new int[]{2,6}));
        input.add(new MergeOverLappingInterval.Interval(new int[]{8,10}));
        input.add(new MergeOverLappingInterval.Interval(new int[]{15,18}));
        List<MergeOverLappingInterval.Interval> result = new MergeOverLappingInterval().merge(input);
        assertThat(result.size(),is(3));
        assertThat(result.get(0).end,is(6));
    }

    @Test
    public void merge_1() {
        ArrayList<MergeOverLappingInterval.Interval> input=new ArrayList<>();
        input.add(new MergeOverLappingInterval.Interval(new int[]{1,3}));
        input.add(new MergeOverLappingInterval.Interval(new int[]{4,6}));
        input.add(new MergeOverLappingInterval.Interval(new int[]{5,10}));
        input.add(new MergeOverLappingInterval.Interval(new int[]{15,18}));
        List<MergeOverLappingInterval.Interval> result = new MergeOverLappingInterval().merge(input);
        assertThat(result.size(),is(3));
        assertThat(result.get(1).end,is(10));
        assertThat(result.get(1).start,is(4));
    }
}