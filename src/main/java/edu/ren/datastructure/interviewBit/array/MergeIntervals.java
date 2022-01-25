package edu.ren.datastructure.interviewBit.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by rrn3194 on 11/20/18.
 */
public class MergeIntervals {

    // [1,3],[2,6],[8,10],[15,18] => [1,6],[8,10],[15,18]

    public List<Interval> merge(ArrayList<Interval> input) {
        Collections.sort(input);
        for (int i = 0; i < input.size() - 1;) {
            if (input.get(i).end >= input.get(i+1).start){
                input.get(i).end = Math.max(input.get(i).end, input.get(i+1).end);
                input.remove(input.get(i+1));
            } else {
                i++;
            }
        }
        return input;
    }
}

class Interval implements Comparable<Interval> {
    int start, end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Interval obj) {
//        return  Integer.compare(this.start, obj.start);
        if (this.start == obj.start) return 0;

        return (this.start > obj.start) ? 1 : -1;
    }
}