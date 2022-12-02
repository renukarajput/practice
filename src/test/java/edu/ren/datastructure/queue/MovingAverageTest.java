package edu.ren.datastructure.queue;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class MovingAverageTest {

    @Test
    public void input_1(){
        MovingAverage obj = new MovingAverage(3);
        assertThat(obj.next(1), is(1.0));
        assertThat(obj.next(10), is(5.5));
        assertThat(obj.next(3), is(4.666666666666667));
        assertThat(obj.next(5), is(6.0));
    }

    @Test
    public void input_2(){
        MovingAverage obj = new MovingAverage(2);
        assertThat(obj.next(1), is(1.0));
        assertThat(obj.next(10), is(5.5));
        assertThat(obj.next(3), is(6.5));
        assertThat(obj.next(5), is(4.0));
    }
}