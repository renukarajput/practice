package edu.ren.datastructure.interviewBit.backtracking;

import java.util.ArrayList;
import java.util.List;

public class AllPairParentheses {
    void gen1(int n) {
        char[] arr = new char[2 * n + 1];
        for (int i = 0; i <= n; i++) {
            arr[i] = '(';
            arr[i + n] = ')';
        }

        //1 "()"
        //2 (()) ()()
        //3 ((())) (()()) (())() ()()()

    }

    ArrayList<String> generate(int n) {
        final ArrayList<String> result = new ArrayList<>();
        generate(new StringBuilder(), 0, 0, n, result);
        return result;
    }

    void generate(StringBuilder seq, int numberOfOpen, int numberOfClose, int numberOfPairs, List<String> result) {
        if (numberOfOpen == numberOfPairs && numberOfClose == numberOfPairs) {
            result.add(seq.toString());
            return;
        }
        if (numberOfOpen < numberOfPairs) {
            seq.append("(");
            generate(seq, numberOfOpen + 1, numberOfClose, numberOfPairs, result);
            seq.deleteCharAt(seq.length() - 1);
        }
        if (numberOfOpen > numberOfClose && numberOfClose < numberOfPairs) {
            seq.append(")");
            generate(seq, numberOfOpen, numberOfClose + 1, numberOfPairs, result);
            seq.deleteCharAt(seq.length() - 1);
        }
    }
}
