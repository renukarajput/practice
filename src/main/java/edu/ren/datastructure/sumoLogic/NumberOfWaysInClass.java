package edu.ren.datastructure.sumoLogic;

import java.math.BigInteger;
import java.util.Arrays;

public class NumberOfWaysInClass {
    int get(int a, int b, int c) {
        double e = 2.71828;
        long MOD_ELEM = (long) (Math.pow(10, 9) + 7);
        int[] numbers = new int[]{a, b, c};
        Arrays.sort(numbers);
        a = numbers[2];
        b = numbers[1];
        c = numbers[0];
        BigInteger a1 = BigInteger.valueOf(a);
        BigInteger b1 = BigInteger.valueOf(b);
        BigInteger c1 = BigInteger.valueOf(c);
        BigInteger total = a1.multiply(b1).multiply(c1);
        BigInteger ab = b1.multiply(c1);
        BigInteger bc = c1.multiply(a1);
        BigInteger ca = c1.multiply(b1);
        BigInteger abc = c1;
        BigInteger res = total.subtract(ab).subtract(bc).subtract(ca).add(abc.multiply(BigInteger.valueOf(2)));
        BigInteger[] result = res.divideAndRemainder(BigInteger.valueOf(MOD_ELEM));
        return result[1].intValue();
    }
}
