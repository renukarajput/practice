package hackerrank;

/**
 * Created by rrn3194 on 11/24/16.
 */

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        Long[] input = {a,b,c,d,e};
//        Arrays.sort(input);  // input = 396285104 573261094 759641832 819230764 364801279
        getMinMaxSum(input);
    }

    private static void getMinMaxSum(Long[] input) {
        Long min = 0L, max =  0L;
        for (int i = 0; i < input.length-1; i++) {
            min = min + input[i];
            max = max + input[i+1];
        }
        System.out.println(min+" "+max);
    }
}

