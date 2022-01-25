package edu.ren.geeks.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FirstUniqueElmTest {
    FirstUniqueElm firstUniqueElm = new FirstUniqueElm();

    @Test
    public void find_1() {
        int[] arr = {1, 1, 2, 4, 4, 5, 5, 6, 6};
        assertThat(firstUniqueElm.find(arr), is(2));
    }
    @Test
    public void find_2() {
        int[] arr = {1, 1, 2,2, 4, 4, 5, 5, 6, 6};
        assertThat(firstUniqueElm.find(arr), is(-1));
    }
    @Test
    public void find_3() {
        int[] arr = {1, 2,2, 4, 4, 5, 5, 6, 6};
        assertThat(firstUniqueElm.find(arr), is(1));
    }
    @Test
    public void find_4() {
        int[] arr = {1,1, 2, 4, 4, 7, 5, 6, 6};
        assertThat(firstUniqueElm.find(arr), is(2 ));
    }
}