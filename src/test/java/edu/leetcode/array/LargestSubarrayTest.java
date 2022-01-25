package edu.leetcode.array;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

import static org.junit.Assert.*;

public class LargestSubarrayTest {

    @Test
    public void largestSubarray() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        int[] nums={1,4,5,2,3};
        int k=4;
        LargestSubarray largestSubarray = new LargestSubarray();
        Class<? extends LargestSubarray> aClass = largestSubarray.getClass();
        Method test = aClass.getDeclaredMethod("test",String.class);
        test.invoke(largestSubarray,"xyz  ");
        //int[] res= largestSubarray.largestSubarray(nums,k);
        //System.out.println(Arrays.toString(res));
    }

    @Test
    public void largestSubarray_1() {
        int[] nums={53,67,81,14,20,56,54,63,38,8,80,59,89,48,19,22};
        int k=5;
        int[] res= new LargestSubarray().largestSubarray(nums,k);
        System.out.println(Arrays.toString(res));
    }

}