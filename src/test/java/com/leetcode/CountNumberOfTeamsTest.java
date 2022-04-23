package com.leetcode;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CountNumberOfTeamsTest {

    private final CountNumberOfTeams obj = new CountNumberOfTeams();

    @Test
    public void input_0(){
        assertThat(obj.numOfTeams(new int[]{2,5,3,4,1}), is(3));
    }
    @Test
    public void input_1(){
        assertThat(obj.numOfTeams(new int[]{13, 3, 4, 10, 7, 8}), is(7));
    }

}