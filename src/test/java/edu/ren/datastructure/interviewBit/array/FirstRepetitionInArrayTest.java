package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FirstRepetitionInArrayTest {
FirstRepetitionInArray firstRepetitionInArray= getFirstRepetitionInArray();

    protected FirstRepetitionInArray getFirstRepetitionInArray() {
        return new FirstRepetitionInArray();
    }

    @Test
    public void getFirstRepeating() {
        Integer arr[] = {1, 6, 3, 1, 3, 6, 6};
        assertThat(firstRepetitionInArray.get(new ArrayList<>(Arrays.asList(arr))),is(1));
    }

    @Test
    public void getFirstRepeating_1() {
        Integer arr[] = {3,4,1,4,1};
        assertThat(firstRepetitionInArray.get(new ArrayList<>(Arrays.asList(arr))),is(1));
    }

    @Test
    public void getFirstRepeating_01() {
        int arr[] = {3,4,1,4,2,1};
        firstRepetitionInArray.printFirstRepeating(arr);
    }
    @Test
    public void getFirstRepeating_02() {
        int arr[] = {10, 5, 3, 4, 3, 5, 6};
        firstRepetitionInArray.printFirstRepeating(arr);
    }

}