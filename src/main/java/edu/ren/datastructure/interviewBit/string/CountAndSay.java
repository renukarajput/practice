package edu.ren.datastructure.interviewBit.string;

public class CountAndSay {
    String nThSequence(int n) {
        int seqNum = 1;
        char[] initialValue = String.valueOf(1).toCharArray();
        while (seqNum < n) {
            char[] seq = nThSequence(initialValue);
            initialValue = seq;
            seqNum++;
        }
        return new String(initialValue);
    }

    char[] nThSequence(char[] seq) {
        int index = 0;
        int lookAheadIndex = 1;
        StringBuilder stringBuilder = new StringBuilder();
        while (lookAheadIndex < seq.length) {
            if (seq[index] != seq[lookAheadIndex]) {
                int count = lookAheadIndex - index;
                stringBuilder.append(count);
                stringBuilder.append(seq[index]);
                index = lookAheadIndex;
            }
            lookAheadIndex++;
        }
//write last pending char
        int count = lookAheadIndex - index;
        stringBuilder.append(count);
        stringBuilder.append(seq[index]);

        return stringBuilder.toString().toCharArray();
    }
}
