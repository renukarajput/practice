package edu.ren.misc.problems;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SeivePrimeTest {
    @Test
    public void primes() {
        SeivePrime seivePrime=new SeivePrime();
        final List<Integer> primes = seivePrime.getPrimes(50);
        System.out.println(primes);
    }
}