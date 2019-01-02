package edu.ren.hackerrank.recursion;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import static com.sun.tools.doclint.Entity.sum;

/**
 * Created by kumarrak on 15/12/18.
 */
public class PowerSumWays {
    int ways(int num, int power) {
        final int[] total = {0};
        ways(num, power, 0, total);
        return total[0];
    }

    boolean ways(int num, int power, int lastUsed, int[] total) {
        if (num == 0) {
            return true;
        }

        for (int i = lastUsed + 1; i <= num; i++) {
            int remainingNum = num - (int) Math.pow(i, power);
            if (ways(remainingNum,power, i , total)) {
                total[0]++;
            }
        }
        return false;
    }
}
