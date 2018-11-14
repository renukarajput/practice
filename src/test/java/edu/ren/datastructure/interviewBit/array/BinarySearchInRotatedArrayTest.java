package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BinarySearchInRotatedArrayTest {
BinarySearchInRotatedArray binarySearchInRotatedArray=new BinarySearchInRotatedArray();
    @Test
    public void findInSortedAndRotated() {
        Integer[] arr={4,5,6,7,0,1, 2};
        assertThat(new BinarySearchInRotatedArray().findInSortedAndRotated(arr,4),is(0));
    }

    @Test
    public void findInSortedAndRotated_1() {
        Integer[] arr={6,7,8,1,2,3,4,5};
        assertThat(new BinarySearchInRotatedArray().findInSortedAndRotated(arr,2),is(4));
    }

    @Test
    public void findInSortedAndRotated_2() {
        Integer[] arr={6,7,8,1,2,3,4,5};
        assertThat(new BinarySearchInRotatedArray().findInSortedAndRotated(arr,5),is(arr.length-1));
    }
    @Test
    public void findInSortedAndRotated_3() {
        Integer[] arr={6,7,8,1,2,3,4,5};
        assertThat(new BinarySearchInRotatedArray().findInSortedAndRotated(arr,9),is(-1));
    }
    @Test
    public void findInSortedAndRotated_4() {
        Integer[] arr={6,7,8,1,2,3,4,5};
        assertThat(new BinarySearchInRotatedArray().findInSortedAndRotated(arr,0),is(-1));
    }
    @Test
    public void findInSortedAndRotated_04() {
        Integer[] arr={1, 7, 67, 133, 178};
        assertThat(new BinarySearchInRotatedArray().findInSortedAndRotated(arr,1),is(0));
    }
    @Test
    public void findInSortedAndRotated_5() {
        Integer[] arr = {180, 181, 182, 183, 184, 187, 188, 189, 191, 192, 193, 194, 195, 196, 201, 202, 203, 204, 3, 4, 5, 6, 7, 8, 9, 10, 14, 16, 17, 18, 19, 23, 26, 27, 28, 29, 32, 33, 36, 37, 38, 39, 41, 42, 43, 45, 48, 51, 52, 53, 54, 56, 62, 63, 64, 67, 69, 72, 73, 75, 77, 78, 79, 83, 85, 87, 90, 91, 92, 93, 96, 98, 99, 101, 102, 104, 105, 106, 107, 108, 109, 111, 113, 115, 116, 118, 119, 120, 122, 123, 124, 126, 127, 129, 130, 135, 137, 138, 139, 143, 144, 145, 147, 149, 152, 155, 156, 160, 162, 163, 164, 166, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177};
        assertThat(new BinarySearchInRotatedArray().findInSortedAndRotated(arr,42),is(43));

    }
    @Test
    public void pivot(){
        Integer[] arr={2,3,4,5,6,7,8,1};
        int pivot = findPivot(arr, 0, arr.length - 1);
        System.out.println(arr[pivot]);
        List<Integer> list = Arrays.asList(arr);
        int peak = binarySearchInRotatedArray.indexOfPeak(list, 0, list.size() - 1);
        assertThat(peak,is(6));
    }

    @Test
    public void pivot1(){
        Integer[] arr={6,7,8,1,2,3,4,5};
        int pivot = findPivot(arr, 0, arr.length - 1);
        List<Integer> list = Arrays.asList(arr);
        int peak = binarySearchInRotatedArray.indexOfPeak(list, 0, list.size() - 1);
        assertThat(peak,is(2));
    }

    @Test
    public void pivot3(){
        Integer[] arr={1,2,3,4,5,6,7};
        int pivot = findPivot(arr, 0, arr.length - 1);
        List<Integer> list = Arrays.asList(arr);
        int peak = binarySearchInRotatedArray.indexOfPeak(list, 0, list.size() - 1);
        assertThat(peak,is(6));
    }

    @Test
    public void pivot4(){
        Integer[] arr={1, 7, 67, 133, 178};
        int pivot = findPivot(arr, 0, arr.length - 1);
        System.out.println(pivot);
        List<Integer> list = Arrays.asList(arr);
        int peak = binarySearchInRotatedArray.indexOfPeak(list, 0, list.size() - 1);
        assertThat(peak,is(4));
    }


    int findPivot(Integer arr[], int low, int high)
    {
        // base cases
        if (high < low) return -1;
        if (high == low) return low;

        int mid = (low + high)/2; /*low + (high - low)/2;*/
        if (mid < high && arr[mid] > arr[mid + 1])
            return mid;

        if (mid > low && arr[mid] < arr[mid - 1])
            return (mid-1);

        if (arr[low] >= arr[mid])
            return findPivot(arr, low, mid-1);

        return findPivot(arr, mid + 1, high);
    }
}