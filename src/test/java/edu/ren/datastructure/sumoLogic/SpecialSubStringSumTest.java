package edu.ren.datastructure.sumoLogic;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SpecialSubStringSumTest {
SpecialSubStringSum specialSubStringSum=new SpecialSubStringSum();
    @Test
    public void getProductOfSum() {
        assertThat(specialSubStringSum.getProductOfSum("abc"),is(18));
    }

    @Test
    public void getProductOfSum_2() {
        assertThat(specialSubStringSum.getProductOfSum("abd"),is(21));
    }

    @Test
    public void getProductOfSum_3() {
        assertThat(specialSubStringSum.getProductOfSum("abdabd"),is(493920));
    }

    @Test
    public void getProductOfSum_11() {
        assertThat(specialSubStringSum.getProductOfSum("gskxoitmz"),is(14225271));
    }
}