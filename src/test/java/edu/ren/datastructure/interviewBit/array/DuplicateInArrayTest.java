package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class DuplicateInArrayTest {

    protected DuplicateInArray getDuplicateInArray() {
        return new DuplicateInArray();
    }

    @Test
    public void testDuplicate() {
        assertThat(getDuplicateInArray().findDuplicate(new Integer[]{5, 1, 4, 2, 3, 5}), is(5));
    }

    @Test
    public void testDuplicate1() {
        assertThat(getDuplicateInArray().findDuplicate(new Integer[]{1, 2, 3}), is(0));
    }

    @Test
    public void testDuplicate2() {
        assertThat(getDuplicateInArray().findDuplicate(new Integer[]{1, 2, 3, 4}), is(0));
    }

    @Test
    public void testDuplicate3() {
        assertThat(getDuplicateInArray().findDuplicate(new Integer[]{1, 2, 3, 2}), is(2));
    }

    @Test
    public void testDuplicateWithoutExtraSpace1() {
        assertThat(getDuplicateInArray().findDuplicate(new Integer[]{1, 4, 3, 5, 2}), is(0));
    }

    @Test
    public void testDuplicateWithoutExtraSpace2() {
        assertThat(getDuplicateInArray().findDuplicate(new Integer[]{1, 4, 3, 5, 4}), is(4));
    }

    @Test
    public void testDuplicateWithoutExtraSpace3() {
        assertThat(getDuplicateInArray().findDuplicate(new Integer[]{5, 4, 3, 1, 2, 3}), is(3));
    }


}