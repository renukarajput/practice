package edu.ren.algo.bsearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class RangeBinarySearch<T extends Comparable<T>> {

//5,7,7,8,8,10
    //8->[3.4]
public int[] getRangeIndexUsingBinarySearch(T[] a, T value) {
    int low = 0, high = a.length - 1;
    while (high >= low) {
        int mid = low+(high-low)/2;
        if(a[mid]==value){
            int highestIndex = getRangeHighestIndexUsingBinarySearch(a, value, mid+1, high);
            if(highestIndex==-1){
                highestIndex=mid;
            }
            int lowestIndex = getRangeLowestIndexUsingBinarySearch(a, value, low, mid-1);
            if(lowestIndex==-1){
                lowestIndex=mid;
            }
            return new int[]{lowestIndex,highestIndex};
        }
        if (a[mid].compareTo(value)>0) {
            high = mid-1;
        }else {
            low=mid+1;
        }
    }
    return new int[]{-1,-1};

}

    int getRangeHighestIndexUsingBinarySearch(T[] a, T value,int low,int high) {
       int prevHighest=-1;
        while (high >= low) {
            int mid = low+(high-low)/2;
            if(a[mid]==value){
                prevHighest=mid;
                low=mid+1;
            }
           else if (a[mid].compareTo(value)>0) {
                high = mid-1;
            }else {
                low=mid+1;
            }
        }
        return prevHighest;
    }

    int getRangeLowestIndexUsingBinarySearch(T[] a, T value,int low,int high) {
        int prevLowest=-1;
        while (high >= low) {
            int mid = low+(high-low)/2;
            if(a[mid]==value){
                prevLowest=mid;
                high=mid-1;

            }
           else if (a[mid].compareTo(value)>0) {
                high = mid-1;
            }else {
                low=mid+1;
            }
        }
        return prevLowest;
    }

    Optional<Integer> getIndexUsingBinarySearch(T[] a, T value) {
        int low = 0, high = a.length - 1;

        while (high >= low) {
            int mid = low+(high-low)/2;
            if(a[mid]==value){
                return Optional.of(mid);
            }
            if (a[mid].compareTo(value)>0) {
                high = mid-1;
            }else {
                low=mid+1;
            }
        }
        return Optional.empty();
    }

    int getIndexOfInsertOrder(T[] a, T value) {
        int low = 0, high = a.length - 1;
        boolean isMidGreater = false;
        int mid = 0;
        while (high >= low) {
            mid = low + (high - low) / 2;
            if (a[mid] == value) {
                return mid;
            }
            if (a[mid].compareTo(value) > 0) {
                high = mid - 1;
                isMidGreater = true;
            } else {
                low = mid + 1;
                isMidGreater = false;
            }
        }
        if (isMidGreater) {
            return mid;
        }
        else {
        return mid + 1;
        }
    }

}
