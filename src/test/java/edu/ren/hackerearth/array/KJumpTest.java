package edu.ren.hackerearth.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class KJumpTest {
    KJump kJump = new KJump();

    @Test
    public void get() {
        int[] arr={1,3,1,4,5,7,10};
       assertThat(kJump.get(arr,2),is(5));
    }

    @Test
    public void get_1() {
        int[] arr={6661,31326,16262,17504,25617,14519,9287,22269,2269,22185};
       assertThat(kJump.get(arr,76),is(4));
    }
}