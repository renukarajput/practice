package edu.ren.datastructure.interviewBit.math;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by rrn3194 on 11/21/18.
 */
public class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    public void input_1() {
        String[] array = {"1", "2", "Fizz", "4", "Buzz"};
        List<String> expected = Arrays.asList(array);
        ArrayList<String> actual = fizzBuzz.fizzBuzzSeries(5);
        assertThat(actual, is(expected));
    }

    @Test
    public void input_2() {
        String[] array = {"1", "2", "Fizz"};
        List<String> expected = Arrays.asList(array);
        ArrayList<String> actual = fizzBuzz.fizzBuzzSeries(3);
        assertThat(actual, is(expected));
    }


}