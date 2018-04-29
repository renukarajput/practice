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
            int highestIndex = getRangeHighestIndexUsingBinarySearch(a, value, mid, high+1);
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
        while (high >= low) {
            int mid = low+(high-low)/2;
            if(a[mid]==value){
                if(mid==high){
                    return mid;
                }
                return getRangeHighestIndexUsingBinarySearch(a,value,mid+1,high);
            }
            if (a[mid].compareTo(value)>0) {
                high = mid-1;
            }else {
                low=mid+1;
            }
        }
        return -1;
    }

    int getRangeLowestIndexUsingBinarySearch(T[] a, T value,int low,int high) {
        while (high >= low) {
            int mid = low+(high-low)/2;
            if(a[mid]==value){
                if(mid==low){
                    return mid;
                }
                //bin search mid+1 to high
                return getRangeLowestIndexUsingBinarySearch(a,value,low,mid-1);
                //bin search low to mid-1
                //int lowestIndex=getRangeIndexUsingBinarySearch(a,value,low,mid-1);
            }
            if (a[mid].compareTo(value)>0) {
                high = mid-1;
            }else {
                low=mid+1;
            }
        }
        return -1;
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
}
