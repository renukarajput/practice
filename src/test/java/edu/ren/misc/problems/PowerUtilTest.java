package edu.ren.misc.problems;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PowerUtilTest {
    PowerUtil powerUtil = new PowerUtil();

    @Test
    public void powerOfN() {
        assertThat(powerUtil.powerOfN(2), is(4));
        assertThat(powerUtil.powerOfN(3), is(8));
        assertThat(powerUtil.powerOfN(4), is(16));
        assertThat(powerUtil.powerOfN(5), is(32));
    }
    @Test
    public void powerOfN_1() {
        assertThat(powerUtil.powerOfNOptimized(2,2), is(4));
        assertThat(powerUtil.powerOfNOptimized(2,3), is(8));
        assertThat(powerUtil.powerOfNOptimized(2,4), is(16));
        assertThat(powerUtil.powerOfNOptimized(2,5), is(32));
    }
}