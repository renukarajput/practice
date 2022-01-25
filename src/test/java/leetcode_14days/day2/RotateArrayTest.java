package leetcode_14days.day2;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RotateArrayTest {
    RotateArray rotateArray = new RotateArray();

    @Test
    public void input_1() {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        assertThat(rotateArray.rotateOptimized(input, 3), is(new int[]{5, 6, 7, 1, 2, 3, 4}));
        System.out.println(Arrays.toString(input));
    }

    @Test
    public void input_2() {
        int[] input = {-1, -100, 3, 99};
        assertThat(rotateArray.rotateOptimized(input, 2), is(new int[]{3, 99, -1, -100}));
        System.out.println(Arrays.toString(input));
    }

    @Test
    public void input_3() {
        int[] input = {-1};
        assertThat(rotateArray.rotateOptimized(input, 2), is(new int[]{-1}));
        System.out.println(Arrays.toString(input));
    }

    @Test
    public void input_4() {
        int[] input = {1, 2};
        assertThat(rotateArray.rotateOptimized(input, 3), is(new int[]{2,1}));
        System.out.println(Arrays.toString(input));
    }
}