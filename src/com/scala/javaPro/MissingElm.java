package com.scala.javaPro;

import java.util.*;

/**
 * Created by rrn3194 on 5/22/16.
 */
public class MissingElm {
    public static void main(String[] args) {
        int arr1[] = {1, 4, 5, 7, 9};
        int arr2[] = {1, 4 ,7, 9};
        Set output = findMissingElm(arr1,arr2);
        System.out.println("==> "+output);
        int res = findMissingElms(arr1,arr2);
        System.out.println(res);
    }

    private static Set findMissingElm(int[] arr1,int[] arr2){
        Set<Integer> resultSet = new HashSet();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int a:arr1)
            set1.add(a);
        for (int b:arr2)
            set2.add(b);

        for(int a : set1) {
            if (!set2.contains(a)){
                resultSet.add(a);
            }
        }

        return resultSet;
    }

    private static int findMissingElms(int[] arr1,int[] arr2){
        int res = 0;
        int m = arr1.length;
        int n = arr2.length;
        int l1,l2;
        if (m > n){
            l1 = m;
            l2 = n;
        }else {
            l1 = n;
            l2 = m;
        }

        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < l2; j++) {   // 1  4 5 7 9  // 1 4 7 9

            }
        }
        return res;
    }
}
