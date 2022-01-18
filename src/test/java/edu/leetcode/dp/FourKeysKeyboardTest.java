package edu.leetcode.dp;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FourKeysKeyboardTest {

    @Test
    public void maxA() {
       assertThat(getFourKeysKeyboard().maxA(3),is(3));
    }

    @Test
    public void maxA_01() {
        assertThat(getFourKeysKeyboard().maxA(7),is(9));
    }

    @Test
    public void maxA_09() {
        assertThat(getFourKeysKeyboard().maxA(9),is(16));
    }

    private FourKeysKeyboard getFourKeysKeyboard() {
        return new FourKeysKeyboardDP();
    }
}