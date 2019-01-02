package edu.ren.datastructure.interviewBit.string;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ValidNumberTest {
    @Test
    public void isValidNumber_1() {
        int output = ValidNumber.isValidNumber("1");
        assertThat(output, is(1));

    }

    @Test
    public void isValidNumber_2() {
        int output = ValidNumber.isValidNumber(" 0.1");
        assertThat(output, is(1));
    }

    @Test
    public void isValidNumber_3() {
        int output = ValidNumber.isValidNumber("abc");
        assertThat(output, is(0));
    }

    @Test
    public void isValidNumber_4() {
        int output = ValidNumber.isValidNumber("1 a");
        assertThat(output, is(0));
    }

    @Test
    public void isValidNumber_5() {
        int output = ValidNumber.isValidNumber("2e10");
        assertThat(output, is(1));
    }

    @Test
    public void isValidNumber_6() {
        int output = ValidNumber.isValidNumber("1u");
        assertThat(output, is(0));
    }

    @Test
    public void isValidNumber_7() {
        int output = ValidNumber.isValidNumber("008");
        assertThat(output, is(1));
    }

    @Test
    public void isValidNumber_8() {
        int output = ValidNumber.isValidNumber(" ");
        assertThat(output, is(0));
    }

    @Test
    public void isValidNumber_9() {
        int output = ValidNumber.isValidNumber("234  ");
        assertThat(output, is(1));
    }

    @Test
    public void isValidNumber_10() {
        int output = ValidNumber.isValidNumber("3e1.1");
        assertThat(output, is(0));
    }

    @Test
    public void isValidNumber_010() {
        int output = ValidNumber.isValidNumber("e2");
        assertThat(output, is(1));
    }

    @Test
    public void isValidNumber_11() {
        int output = ValidNumber.isValidNumber("1aa1");
        assertThat(output, is(0));
    }

    @Test
    public void isValidNumber_12() {
        int output = ValidNumber.isValidNumber("72e.10");
        assertThat(output, is(0));
    }

    @Test
    public void isValidNumber_13() {
        int output = ValidNumber.isValidNumber("72.1.2");
        assertThat(output, is(0));
    }


    @Test
    public void isValidNumber_14() {
        int output = ValidNumber.isValidNumber("0.1");
        assertThat(output, is(1));
    }

    @Test
    public void isValidNumber_16() {
        int output = ValidNumber.isValidNumber("-01.1e-10");
        assertThat(output, is(1));
    }

    @Test
    public void isValidNumber_17() {
        int output = ValidNumber.isValidNumber("3.");
        assertThat(output, is(0));
    }
    @Test
    public void isValidNumber_18() {
        int output = ValidNumber.isValidNumber("1.e1");
        assertThat(output, is(0));
    }

}