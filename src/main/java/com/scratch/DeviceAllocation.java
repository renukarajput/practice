package com.scratch;

import scala.actors.threadpool.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@SuppressWarnings("Duplicates")
public class DeviceAllocation {
    List<List<Integer>> optimalUtilization1(
            int deviceCapacity,
            List<List<Integer>> foregroundAppList,
            List<List<Integer>> backgroundAppList) {
        int best = Integer.MAX_VALUE;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < foregroundAppList.size(); i++) {
            for (int j = 0; j < backgroundAppList.size(); j++) {
                final int required = foregroundAppList.get(i).get(1) + backgroundAppList.get(j).get(1);
                if (deviceCapacity < required) {
                    continue;
                }
                List<Integer> pair = new ArrayList<>();
                pair.add(i + 1);
                pair.add(j + 1);
                if (deviceCapacity - required < best) {
                    best = deviceCapacity - required;
                    result.clear();
                    result.add(pair);
                } else if (deviceCapacity == required) {
                    best = 0;
                    result.add(pair);
                }
            }

        }
        return result;
    }


    List<List<Integer>> optimalUtilization(
            int deviceCapacity,
            List<List<Integer>> foregroundAppList,
            List<List<Integer>> backgroundAppList) {
       /* Comparator<List<Integer>> comparator = Comparator.comparingInt(one -> one.get(1));
        Collections.sort(foregroundAppList, comparator);
        Collections.sort(backgroundAppList, comparator);*/
        List<List<Integer>> result = new ArrayList<>();
        List<List<Integer>> matches = new ArrayList<>();
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < foregroundAppList.size(); i++) {
            int value1 = foregroundAppList.get(i).get(1);
            int target = deviceCapacity - value1;
            if (target < 0) {
                continue;
            }
            int start = 0, end = backgroundAppList.size()-1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (backgroundAppList.get(mid).get(1) == target) {
                    diff=0;
                    List<Integer> pair = new ArrayList<>();
                    pair.add(i + 1);
                    pair.add(mid + 1);
                    result.add(pair);
                    break;
                }
               else if (backgroundAppList.get(mid).get(1) < target) {
                    start = mid + 1;
                    if(target-backgroundAppList.get(mid).get(1)<diff){
                        matches.clear();
                        diff=target-backgroundAppList.get(mid).get(1);
                    }
                    if(target-backgroundAppList.get(mid).get(1)<=diff){
                        List<Integer> pair = new ArrayList<>();
                        pair.add(i + 1);
                        pair.add(mid + 1);
                        matches.add(pair);
                    }
                } else {
                    end = mid - 1;
                }
            }
        }
        if(result.isEmpty()){
            return matches;
        }
        return result;
    }

}
