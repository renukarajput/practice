package edu.ren.geeks.array;

import java.util.*;

//a+b=k
//b=k-a

class Pair {
    int no1;
    int no2;

    public Pair(int no1, int no2) {
        this.no1 = no1;
        this.no2 = no2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return no1 == pair.no1 &&
                no2 == pair.no2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(no1, no2);
    }
}

public class CountPairs {
    // 5 7 9 13  11 6 6 3 3 : 12
    public int countPairs(List<Integer> list, long target) {
        Collections.sort(list);
        Set<Pair> set = new HashSet<>();

        for (int i = 0; i < list.size(); i++) {
            long diff = target - list.get(i);
            if (diff > Integer.MAX_VALUE) {
                continue;
            }
            int num = (int) diff;
            int idxOfNum = bSearch(list, i, num);
            if (idxOfNum > -1) {
                set.add(new Pair(list.get(idxOfNum), list.get(i)));
            }

        }
        return set.size();
    }

    private static int bSearch(List<Integer> list, int i, int diff) {
        int start = i + 1;
        int end = list.size() - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (list.get(mid) == diff) {
                return mid;
            }
            if (list.get(mid) < diff) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }
}
