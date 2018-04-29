package edu.ren.algo.bsearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class RangeBinarySearch<T extends Comparable<T>> {

    public ArrayList<Integer> searchRange(final List<Integer> a, int b) {
        Integer[] arr = a.toArray(new Integer[a.size()]);
        int[] rangeIndexUsingBinarySearch =new RangeBinarySearch<Integer>().getRangeIndexUsingBinarySearch(arr,b);
        final ArrayList<Integer> result=new ArrayList(2);
        result.add(rangeIndexUsingBinarySearch[0]);
        result.add(rangeIndexUsingBinarySearch[1]);
        return result;
    }
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
                int highest = getRangeHighestIndexUsingBinarySearch(a, value, mid + 1, high);
                if(highest==-1){
                    return mid;
                }else
                    return highest;
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
                int lowest = getRangeLowestIndexUsingBinarySearch(a, value, low, mid - 1);
                if(lowest==-1){
                    return mid;
                }
                else {
                    return lowest;
                }
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
