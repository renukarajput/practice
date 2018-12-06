package edu.ren.datastructure.interviewBit.backtracking;

import java.util.Arrays;

public class KthSequence {
    String getKth(String charset, int k) {
       return getKth(charset.toCharArray(),k);
    }


    private String getKth(char[] charset, int k) {
        int len = 1;
        char[] sb = "".toCharArray();
        int[] seq = new int[]{k};
        for (int i = 0; i < charset.length; i++) {
            sb = new char[len];
            if (seq[0] == 0) {
                break;
            }
            generateCombinationsOfLength(charset, 0, 0, len, seq, sb);
            len++;
        }
        return new String(sb);
    }

    //a b c aa ab ac aaa aab abb abc aaaa aaab aabb abbb abbc abcc accc
    private void generateCombinationsOfLength(char[] charset, int start, int fillPosition, int len, int[] seqNo, char[] sb) {
        if (fillPosition < 0 || fillPosition > len) {
            return;
        }
        System.out.println(seqNo[0]+" -- "+Arrays.toString(sb));
        if (len == fillPosition) {
            seqNo[0]--;
            return;
        }


        for (int i = start; i < charset.length; i++) {
            sb[fillPosition] = charset[i];
            generateCombinationsOfLength(charset, start, fillPosition + 1, len, seqNo, sb);
           if(start<charset.length-1) {
               sb[fillPosition] = charset[start+1];
               seqNo[0]--;
               System.out.println(seqNo[0]+" -- "+Arrays.toString(sb));
               //generateCombinationsOfLength(charset, start + 1, fillPosition, len, seqNo, sb);
           }
        }
    }
}
