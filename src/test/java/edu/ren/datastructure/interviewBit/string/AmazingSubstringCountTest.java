package edu.ren.datastructure.interviewBit.string;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class AmazingSubstringCountTest {
AmazingSubstringCount amazingSubstringCount=new AmazingSubstringCount();

    @Test
    public void count() {
        assertThat(amazingSubstringCount.count("ABEC"),is(6));
    }

    @Test
    public void count_1() {
        assertThat(amazingSubstringCount.count("ABEC"),is(6));
    }
}