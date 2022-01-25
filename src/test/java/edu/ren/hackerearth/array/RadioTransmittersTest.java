package edu.ren.hackerearth.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RadioTransmittersTest {
    RadioTransmitters radioTransmitters = new RadioTransmitters();

    @Test
    public void noOfRequiredTransmitters_1() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(2, radioTransmitters.noOfRequiredTransmitters(arr, 1));
    }

    @Test
    public void noOfRequiredTransmitters_2() {
        int[] arr = {1, 3, 5, 4, 9, 7, 11, 15};
        assertEquals(3, radioTransmitters.noOfRequiredTransmitters(arr, 2));
    }

    @Test
    public void noOfRequiredTransmitters_3() {
        int[] arr = {7, 2, 4, 6, 5, 9, 12, 11};
        assertEquals(3, radioTransmitters.noOfRequiredTransmitters(arr, 2));
    }

    @Test
    public void get_1() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(2, radioTransmitters.get(arr, 1));
    }

    @Test
    public void get_2() {
        int[] arr = {1, 3, 5, 4, 9, 7, 11, 15};
        assertEquals(3, radioTransmitters.get(arr, 2));
    }

    @Test
    public void removeDuplicateFromList() {
        Integer[] arr = {1, 2, 3, 4, 5, 1, 2};
        ArrayList<Integer> uniqueNumbers = new ArrayList<>(new HashSet<>(Arrays.asList(arr)));
        System.out.println("+=== "+ uniqueNumbers);
        final List<Integer> list = new ArrayList<>(); // Arrays.asList(arr);
        System.out.println("before - "+ list + " === "+ list.size());
        list.add(50);
        list.add(70);
        list.remove(0);
        System.out.println("after - "+ list);
    }

    @Test
    public void test() {
        A a = new B();
        a.m1(null);
        a.m1("abc");
        a.m1(2);
    }
}

class A {
    Object m1(Object o) {
        System.out.println("m1 of object");
        return 0;
    }
//    Integer m1(Integer s) {
//        System.out.println("m1 of String");
//        return s;
//    }
}

class B extends A {
    String m1(String s) {
        System.out.println("m1 of String");
        return s;
    }
}