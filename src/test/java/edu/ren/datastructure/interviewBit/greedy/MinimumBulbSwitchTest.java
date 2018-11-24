package edu.ren.datastructure.interviewBit.greedy;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MinimumBulbSwitchTest {
    MinimumBulbSwitch minimumBulbSwitch=new MinimumBulbSwitch();

    @Test
    public void min(){
        Integer[] arr={0,1,0,1};
        assertThat(minimumBulbSwitch.min(arr),is(4));

    }

  @Test
    public void min_1(){
        Integer[] arr={1,1,0,1};
        assertThat(minimumBulbSwitch.min(arr),is(2));
    }

    @Test
    public void min_2(){
        Integer[] arr={1,1,1,1};
        assertThat(minimumBulbSwitch.min(arr),is(0));
    }

}