package edu.leetcode.array;

import java.util.TreeSet;

public class FixPotholes {
    static final char POTHOLE = 'x';

    public int solution(String S, int B) {
        return solution(S.toCharArray(), 0, B);
    }

    int solution(char[] ch, int start, int budget) {
        if (budget <= 0 || start >= ch.length) {
            return 0;
        }
        int total ;
        if (ch[start] != POTHOLE) {
            int end = start;
            while (end < ch.length && ch[end] != POTHOLE) {
                end++;
            }
            return solution(ch, end, budget);

        } else {
            int end = start;
            while (end < ch.length && ch[end] == POTHOLE) {
                end++;
            }
            int c = end - start;
            if (budget <= c) {
                return budget - 1;
            }
            int inc = c + solution(ch, end, budget - c - 1);
            int exc = solution(ch, end, budget);
            total = Math.max(inc, exc);
        }

        return total;
    }

    int solution_(char[] ch, int budget) {
        int totlalCount = 0;
        TreeSet<Integer> maxSet = new TreeSet<>();
        int count = 0;
        boolean pending = false;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == POTHOLE) {
                pending = true;
                count++;
            } else if (count != 0) {
                if (budget > count) {
                    maxSet.add(count);
                    budget = budget - count - 1;
                    totlalCount += count;
                    count = 0;
                    pending = false;
                } else {
                    Integer lowest = maxSet.first(); //3  1  3t
                    //4  2
                    while (lowest < count && budget < count) {
                        budget = budget + lowest + 1;
                        totlalCount -= lowest;
                        maxSet.remove(lowest);
                        if (maxSet.isEmpty())
                            break;
                        lowest = maxSet.first();

                    }
                    totlalCount = totlalCount + budget - 1;
                    count = 0;
                    budget = 0;
                    pending = false;
                }

            }
        }
        if (pending && budget > count) {
            totlalCount = totlalCount + budget - 1;
        }

        return totlalCount;
    }
}
