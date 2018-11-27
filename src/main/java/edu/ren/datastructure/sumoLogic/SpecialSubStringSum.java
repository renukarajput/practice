package edu.ren.datastructure.sumoLogic;

import java.math.BigInteger;
import java.util.*;

public class SpecialSubStringSum {
    int getProductOfSum(String str) {
        return getProductOfSum(str.toCharArray());
    }

    int getProductOfSum(char[] str) {
        double MOD_ELEM = Math.pow(10, 9) + 7;
        int MOD_NUM= (int) MOD_ELEM;
        BigInteger product = BigInteger.valueOf(1);
        List<Integer> indexesOfStart = new LinkedList<>();
        for (int i = 0; i <str.length ; i++) {
            if(str[i]==str[0])
                indexesOfStart.add(i);
        }
        while (!indexesOfStart.isEmpty()) {
            Integer indexOfStart = indexesOfStart.remove(0);
            int sum = 0;
            for (int i = indexOfStart, j = 0; i < str.length; i++, j++) {
                if (str[i] == str[j]) {
                    sum = sum + getNumericValue(str[i]);
                    product=product.multiply(BigInteger.valueOf(sum));
                }else {
                    sum=0;
                }
            }
        }
        BigInteger[] res = product.divideAndRemainder(BigInteger.valueOf(MOD_NUM));
        return res[1].intValue();
    }

    private int getNumericValue(char ch) {
        return ch-96;
    }
}
