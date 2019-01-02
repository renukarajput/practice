package edu.ren.hackerrank.recursion;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Created by kumarrak on 15/12/18.
 */
public class PowerSumWaysTest {
    PowerSumWays powerSumWays=new PowerSumWays();

    @Test
    public void waysPowerSum() throws Exception {
       assertThat(powerSumWays.ways(13,2),is(1));
    }

    @Test
    public void waysPowerSum_1() throws Exception {
       assertThat(powerSumWays.ways(100,2),is(3));
    }

    @Test
    public void waysPowerSum_2() throws Exception {
       assertThat(powerSumWays.ways(100,3),is(1));
    }
}