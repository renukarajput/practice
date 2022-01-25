package edu.ren.datastructure.interviewBit.array;

/**
 * Created by rrn3194 on 8/31/18.
 */
public class SecondMaxInArray {

    public static int findSecondMax(int[] a) {
        int max, smax;
        max = a[0];
        smax = a[1];
        for (int i = 0; i < a.length; i++) {
            if (max == a[i]) {
                continue;
            }
            if (max < a[i]) {
                smax = max;
                max = a[i];
            } else {
                if (smax < a[i]) {
                    smax = a[i];
                }
            }
        }
        return smax;
    }

    public int testt(int a[]){
        int max=a[0];
        int smax=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max=a[i];
            }
            if (a[i] >= smax && a[i] < max){
                smax=a[i];
            }
        }
        System.out.println("smax "+ smax);
        return smax;
    }

    public static int findSecondMaxUsingRecursion(int[] a) {
        int max, smax, pos = 0;
        max = a[0];
        smax = a[1];

        return findSecondmaxUtil(a, smax, max, pos);
    }

    private static int findSecondmaxUtil(int[] a, int smax, int max, int pos) {
        if (pos == a.length)
            return smax;

        if (max != a[pos]) {
            if (max < a[pos]) {
                smax = max;
                max = a[pos];
            } else {
                if (smax < a[pos]) {
                    smax = a[pos];
                }
            }
        }
        return findSecondmaxUtil(a, smax, max, pos + 1);
    }
}
