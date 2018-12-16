package edu.ren.datastructure.interviewBit.array;

import java.util.HashSet;
import java.util.Set;

public class PossiblePairsForK {

    public Set<Pair> getPairForK(int[] input, int k) {
        Set<Integer> elements = addToSet(input);
        Set<Pair> pairForSum = new HashSet<>();

        for (int i = 0; i < input.length; i++) {
            Integer diff = input[i] - k;
            if (diff < 0)
                diff = diff * (-1);

            if (elements.contains(diff)) {
                Pair pair = new Pair(input[i], diff);
                if (!pairForSum.contains(pair))
                    pairForSum.add(pair);
            }
        }
        System.out.println("***** " + pairForSum);
        return pairForSum;
    }

    private Set<Integer> addToSet(int[] input) {
        Set<Integer> set = new HashSet<>();
        for (Integer i : input) {
            set.add(i);
        }
        return set;
    }
}

class Pair {
    int first, second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pair pair = (Pair) o;

        if (first == pair.second && second == pair.first) return true;

        if (first == pair.first && second == pair.second) return true;

        return false;
    }

    @Override
    public int hashCode() {
        int one = first;
        int two = second;
        if (one > two) {
            int temp = one;
            one = two;
            two = temp;
        }
        int result = one;
        result = 31 * result + two;
        return result;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}

