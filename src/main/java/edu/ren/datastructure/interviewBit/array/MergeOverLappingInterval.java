package edu.ren.datastructure.interviewBit.array;

import java.util.*;

public class MergeOverLappingInterval {
    static class Interval {
        int start;
        int end;

        Interval(int[] arr) {
            start = arr[0];
            end = arr[1];
        }

        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    ArrayList<Interval> merge(ArrayList<Interval> intervalList) {
        intervalList.sort(Comparator.comparingInt(a -> a.start));
        Iterator<Interval> iterator = intervalList.iterator();
        Interval prevMerged = null;
        while (iterator.hasNext()) {
            Interval thisInterval = prevMerged;
            if (thisInterval == null) {
                thisInterval = iterator.next();
            }
            if (iterator.hasNext()) {
                Interval nextInterval = iterator.next();
                prevMerged = nextInterval;
                if (nextInterval.start < thisInterval.end) {
                    if(nextInterval.end>=thisInterval.end) {
                        thisInterval.end = nextInterval.end;
                    }
                    prevMerged=thisInterval;
                    iterator.remove();
                }
            }
        }
        return intervalList;
    }
}
