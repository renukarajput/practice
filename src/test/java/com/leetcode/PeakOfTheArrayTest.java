package com.leetcode;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PeakOfTheArrayTest {
    PeakOfTheArray obj = new PeakOfTheArray();

    @Test
   public void input_0(){
        assertEquals(obj.findPeakElement(new int[]{1, 2, 3, 1}), 2);
        assertEquals(2, obj.findPeakElementBinarySearch(new int[]{1, 2, 3, 1}));
    }
    @Test
    public void input_1(){
        assertEquals(obj.findPeakElement(new int[]{1,2,1,3,5,6,4}), 1);
        assertEquals(5,obj.findPeakElementBinarySearch(new int[]{1,2,1,3,5,6,4}));
    }
    @Test
    public void input_2(){
        assertEquals(obj.findPeakElement(new int[]{1}), 0);
        assertEquals(0, obj.findPeakElementBinarySearch(new int[]{1}));
    }
    @Test
    public void input_3(){
        assertEquals(obj.findPeakElement(new int[]{1, 2}), 1);
        assertEquals(1,obj.findPeakElementBinarySearch(new int[]{1, 2}));
    }
    @Test
    public void peakIndexInMountainArray(){
        assertEquals(1,obj.peakIndexInMountainArray(new int[]{0,1,0}));
        assertEquals(1,obj.peakIndexInMountainArray(new int[]{0,2,1,0}));
        assertEquals(1,obj.peakIndexInMountainArray(new int[]{0,10,5,2}));
    }

    @Test
    public void peakIndexInMountainArrayBinarySearch(){
        assertEquals(1,obj.peakIndexInMountainArrayBinarySearch(new int[]{0,1,0}));
        assertEquals(1,obj.peakIndexInMountainArrayBinarySearch(new int[]{0,2,1,0}));
        assertEquals(1,obj.peakIndexInMountainArrayBinarySearch(new int[]{0,10,5,2}));
    }
}