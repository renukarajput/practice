package edu.ren.geeks.programs;

import org.junit.Ignore;
import org.junit.Test;


/**
 * Created by rrn3194 on 9/5/17.
 */
@Ignore
public class PronicNumberTest {
    PronicNumber pronicNumber = new PronicNumber();

    @Test
    public void positiveIntegerInput1() {
        pronicNumber.getPronicNumberUptoN(56);
    }

    @Test
    public void positiveIntegerInput2() {
        pronicNumber.getPronicNumberUptoN(2);
    }

    @Test(expected = NumberFormatException.class)
    public void negativeInteger() {
        int range = -10;
        boolean isThrown = false;
        try {
            pronicNumber.getPronicNumberUptoN(range);
        }catch (NumberFormatException nfe){
            isThrown = true;
        }
    }

}
