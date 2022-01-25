package edu.leetcode.backtracking;

import java.util.*;

public class ConfusingNumber2 {
    static final List<Integer> confusingDigits = Arrays.asList(0, 1, 6, 8, 9);
    static final Map<Integer, Integer> confusing = new HashMap<>();

    static {
        confusing.put(1, 1);
        confusing.put(0, 0);
        confusing.put(6, 9);
        confusing.put(8, 8);
        confusing.put(9, 6);
    }

    public int confusingNumberII(int N) {

        List<Integer> confusingNumbers = new ArrayList<>();
        int numberOfDigits = getNumberOfDigits(N);
        for (int i = 1; i <= numberOfDigits; i++) {
            combination(confusingDigits.size(), i, 0, confusingNumbers, new ArrayList<>(), N);
        }
        Collections.sort(confusingNumbers);
        System.out.println(confusingNumbers);
        return confusingNumbers.size();
    }


    private void combination(int n, int k, int start, List<Integer> result, ArrayList<Integer> current, int max) {
        if (0 == k) {
            getConfusingNumber(current, 0, max, result);
            return;
        }
        for (int i = start; i < n; i++) {
            current.add(i);
            combination(n, k - 1, start, result, current, max);
            current.remove(current.size() - 1);
        }
    }

    private void getConfusingNumber(List<Integer> currentNum, int start, int max, List<Integer> result) {
        for (int i = start; i < currentNum.size(); i++) {
            while (start < currentNum.size() && i != start && currentNum.get(i) == currentNum.get(start)) {
                start++;
            }
            if (start < currentNum.size() && currentNum.get(i) != currentNum.get(start)) {
                Collections.swap(currentNum, i, start);
                getConfusingNumber(currentNum, start + 1, max, result);
                Collections.swap(currentNum, start, i);
            }
            if (start == currentNum.size() - 1) {
                System.out.println(currentNum);
                int confusingNumber = getConfusingNumber(currentNum, max);
                if (confusingNumber != -1 && confusingNumber <= max && !result.contains(confusingNumber))
                    result.add(confusingNumber);
            }

        }
    }

    private int getConfusingNumber(List<Integer> currentNum, int max) {
        int num = 0;
        int otherNum = 0;

        for (int i = currentNum.size() - 1; i >= 0; i--) {
            int digitIndex = currentNum.get(i);
            int confusingDigit = confusingDigits.get(digitIndex);
            otherNum = otherNum * 10 + confusing.get(confusingDigit);
            int thisNumberDigitIndex = currentNum.get(currentNum.size() - i - 1);
            int digit = confusingDigits.get(thisNumberDigitIndex);
            num = num * 10 + digit;
        }
        if (num == otherNum) {
            return -1;
        }
        if (currentNum.size() == 1 && num != otherNum) {
            return num;
        }

        if (currentNum.size() != 1 && num <= max && currentNum.get(0) != 0) {
            return num;
        }
        if (currentNum.size() != 1 && otherNum <= max && currentNum.get(currentNum.size() - 1) != 0) {
            return otherNum;
        }
        return -1;
    }

    int getNumberOfDigits(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
}
