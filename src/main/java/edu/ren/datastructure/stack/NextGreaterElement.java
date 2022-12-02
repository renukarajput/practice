package edu.ren.datastructure.stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {

    public int[] print1(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int nextGreaterElm = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    nextGreaterElm = arr[j];
                    break;
                }
            }
            System.out.println(arr[i] + " - " + nextGreaterElm);
            result[i] = nextGreaterElm;
        }
        return result; //list.toArray(new Integer[list.size()])
    }

    public int[] get(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        Arrays.fill(result, -1);

        for (int i = 1; i < arr.length; i++) {
            Integer top = stack.peek();
            while (arr[top] < arr[i]) {
                Integer pop = stack.pop();
                result[pop] = arr[i];
                if (stack.isEmpty()) {
                    break;
                }
                top = stack.peek();
            }
            stack.push(i);
        }
        return result;
    }
//    https://leetcode.com/problems/next-greater-element-i/
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap();
        Stack<Integer> stack = new Stack();
        stack.push(nums2[0]);
        for(int i=1;i < nums2.length;i++){
            while(!stack.isEmpty() && stack.peek() < nums2[i]) {
                int top = stack.pop();
                map.put(top, nums2[i]);
            }
            stack.push(nums2[i]);
        }
        int[] result = new int[nums1.length];
        for(int i=0;i < nums1.length;i++){
            result[i] = map.getOrDefault(nums1[i], -1);
        }
        return result;
    }
}
