package edu.ren.datastructure.interviewBit.array;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CountOfArrayTest {

    private ByteArrayOutputStream outputStream;

    @Before
    public void setup() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void count_1() {
        int[] arr = {2, 3, 3, 2, 5};
        new CountOfArray().count(arr);
        String expectedOutput = "2-->2\n3-->2\n5-->1\n";
        assertThat(outputStream.toString(), is(expectedOutput));
    }

    @Test
    public void count_2() {
        int[] arr = {2, 2,3, 3, 2, 5};
        new CountOfArray().count(arr);
        String expectedOutput = "2-->3\n3-->2\n5-->1\n";
        assertThat(outputStream.toString(), is(expectedOutput));
    }

    @Test
    public void count_all_same() {
        int[] arr = {2, 2, 2, 2, 2};
        new CountOfArray().count(arr);
        String expectedOutput = "2-->5\n";
        assertThat(outputStream.toString(), is(expectedOutput));
    }

    @Test
    public void count_continious_numbers() {
        int[] arr = {1, 2, 3, 4, 5};
        new CountOfArray().count(arr);
        String expectedOutput = "1-->1\n2-->1\n3-->1\n4-->1\n5-->1\n";
        assertThat(outputStream.toString(), is(expectedOutput));
    }
}