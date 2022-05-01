package edu.ren.misc.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeivePrime {

    List<Integer> getPrimes(int n) {
        boolean[] isNonPrime = new boolean[n];

        int currentNumber = 2;

        while (currentNumber * currentNumber < n) {
            if (!isNonPrime[currentNumber]) {
                for (int index = currentNumber * currentNumber; index < n; index += currentNumber) {
                    isNonPrime[index] = true;
                }
            }
            currentNumber++;
        }

        return getPrimesIn(isNonPrime);

    }
    class A{
        class B{

        }
    }

    private List<Integer> getPrimesIn(boolean[] isNumberPrime) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < isNumberPrime.length; i++) {
            if (!isNumberPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }
}
