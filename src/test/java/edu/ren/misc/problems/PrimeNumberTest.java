package edu.ren.misc.problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumberTest {

    PrimeNumber primeNumber = new PrimeNumber();

    @Test
    public void input_1() {
        primeNumber.generate(100);
        System.out.println();
        primeNumber.generatePrimeNumForRange(100);
    }

    @Test
    public void input_2() {
        primeNumber.get(100);
    }

    @Test
    public void input_3() {
        primeNumber.printPrime(50);
    }
    @Test
    public void input_4() {
        assertTrue(primeNumber.isPrimeNo(9));
        assertTrue(primeNumber.isPrimeNo(19));
        assertTrue(primeNumber.isPrimeNo(11));
        assertFalse(primeNumber.isPrimeNo(20));
        assertFalse(primeNumber.isPrimeNo(35));
    }
}