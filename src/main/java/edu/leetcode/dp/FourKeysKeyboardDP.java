package edu.leetcode.dp;

import java.util.HashMap;
import java.util.Map;

public class FourKeysKeyboardDP extends FourKeysKeyboard {
    @Override
    public int maxA(int N) {
        int[] lengths = new int[N];
        int bufferLength = 0;
        lengths[0] = 1;
        lengths[1] = 2;
        lengths[2] = 3;
        for (int i = 3; i < N; i++) {
            int byA = lengths[i - 1] + 1;
            int byCtrlV = lengths[i - 1] + bufferLength;
            int byCtrlACV = 2 * lengths[i - 3];
            if (byCtrlACV >= byA && byCtrlACV >= byCtrlV) {
                bufferLength = lengths[i - 3];
                lengths[i]=byCtrlACV;
            }else {
                lengths[i]=Math.max(byA,byCtrlV);
            }

        }
        return lengths[lengths.length-1];
    }
}
