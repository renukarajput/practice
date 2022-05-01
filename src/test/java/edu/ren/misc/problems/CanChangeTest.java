package edu.ren.misc.problems;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CanChangeTest {

    @Test
    public void can_give_change() {
        final int index = CanChange.can_give_change(Arrays.asList(5, 10, 5, 5, 5, 20));
        System.out.println(index);
    }  @Test
    public void can_give_change_1() {
        final int index = CanChange.can_give_change(Arrays.asList( 5, 20));
        System.out.println(index);
    }
}