package com.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class TopFiveAverage {
    private static final Map<Integer, Integer> result = new HashMap<>();
    static Integer[][] topFiveAvg;

    public static Integer[][] highFive(int[][] items) {
        final Map<Integer, Integer> resMap = highFiveUtil(items);
        topFiveAvg = new Integer[resMap.size()][];
        final Iterator<Map.Entry<Integer, Integer>> iterator = resMap.entrySet().iterator();
        int i = 0;
        while (iterator.hasNext()) {
            final Map.Entry<Integer, Integer> next = iterator.next();
            topFiveAvg[i] = (Integer[]) Arrays.asList(next.getKey(), next.getValue()).toArray();
            i++;
        }
        return topFiveAvg;
    }

    public static Map<Integer, Integer> highFiveUtil(int[][] items) {
        List<Integer> scoreList;
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < items.length; i++) {
            final int key = items[i][0];
            if (!map.containsKey(key)) {
                scoreList = new ArrayList<>();
                scoreList.add(items[i][1]);
                map.put(key, scoreList);
            } else {
                final List<Integer> existingScoreList = map.get(key);
                existingScoreList.add(items[i][1]);
                map.put(key, existingScoreList);
            }
        }
        System.out.println("map : " + map);
        final Iterator<Map.Entry<Integer, List<Integer>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            final Map.Entry<Integer, List<Integer>> next = iterator.next();
            final Integer key = next.getKey();
            final List<Integer> marks = map.get(key);
            if (marks.size() > 5) {
                final List<Integer> collect = marks.stream().sorted(Comparator.reverseOrder()).limit(5).collect(Collectors.toList());
                marks.clear();
                marks.addAll(collect);
            }
            int sum = marks.stream().mapToInt(x -> x).sum();
            result.put(key, sum / 5);
        }
        return result;
    }

    public static void main(String[] args) {
        final Integer[][] res = highFive(new int[][]{{1, 91}, {1, 92}, {2, 93}, {2, 97}, {1, 60}, {2, 77}, {1, 65}, {1, 87}, {1, 100}, {2, 100}, {2, 76}});

        int[][] result = new int[res.length][];
        int k = 0;
        for (Integer[] i : res) {
            final int[] ints = Arrays.stream(i).mapToInt(x -> x).toArray();
            result[k] = ints;
            System.out.println(Arrays.toString(result[k]));
            k++;
        }
    }
}
