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
        int lookAheadIndex = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (lookAheadIndex < seq.length) {
            if (lookAheadIndex == seq.length - 1 || (seq[index] != seq[lookAheadIndex])) {
                int count = lookAheadIndex - index;
                if (seq[index] == seq[lookAheadIndex]) { //this is last char and last equals char at index
                    count += 1;
                }
                stringBuilder.append(count);
                stringBuilder.append(seq[index]);
                if (lookAheadIndex == seq.length - 1 && seq[index] != seq[lookAheadIndex]) {
                    stringBuilder.append(1);
                    stringBuilder.append(seq[lookAheadIndex]);
                }
                index = lookAheadIndex;
            }
            lookAheadIndex++;
        }

        return stringBuilder.toString().toCharArray();
    }
}
