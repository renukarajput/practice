package edu.ren.datastructure.interviewBit.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class EqualAveragePartition {
    ArrayList<Integer>[] partition(List<Integer> list) {
        ArrayList[] result = {new ArrayList<>(), new ArrayList<>()};
        partition(list, 0, result[0], 0, result[1], 0);
        return result;
    }

    int count = 1;

    private boolean partition(List<Integer> list, int index, List<Integer> first, int firstSum, List<Integer> second, int secondSum) {

        if (index == list.size()) {
            if(first.size()==0||second.size()==0){
                return false;
            }
            final int avg1 = first.stream().mapToInt(i -> i).sum() / first.size();
            final int avg2 = second.stream().mapToInt(i -> i).sum() / second.size();
            if (avg1 == avg2) {
                System.out.print("" + count++ + "  ");
                System.out.println(first + "   " + second);
                return true;
            }
            return false;
        }

        first.add(list.get(index));
        final boolean partition1 = partition(list, index + 1, new ArrayList<>(first), firstSum + list.get(index), new ArrayList<>(second), secondSum);
        first.remove(list.get(index));
        second.add(list.get(index));
        final boolean partition2 = partition(list, index + 1, new ArrayList<>(first), firstSum, new ArrayList<>(second), secondSum + secondSum + list.get(index));


        return partition1||partition2;
    }
}
