package edu.ren.misc.problems;

public class ReverseWordsInSentence {
    final char SPACE = ' ';

    void reverse(char[] sentence) {
        int start = 0, end = sentence.length - 1;
        while (start < end) {
            int currenStart = start, currentEnd = end;
            while (sentence[start] != SPACE) {
                start++;
            }
            while (sentence[end] != SPACE) {
                end--;
            }
            int lengthOfWordAtEnd = currentEnd - end;
            int lengthOfWordAtStart = start - currenStart;
            int diff = Math.abs(lengthOfWordAtEnd - lengthOfWordAtStart);
            char[] temp = new char[diff];
            if (lengthOfWordAtEnd > lengthOfWordAtStart) {
                for (int i = 0; i < diff; i++) {
                    temp[i] = sentence[currentEnd + i]; //copy before rotating right
                }
                rotateRight(sentence, currenStart, currentEnd, diff);
                int rightWord = end + 1+diff;
                int leftWord = currenStart + diff;
                for (int i = 0; i < lengthOfWordAtStart; i++) {
                    char tempCh = sentence[leftWord + i];
                    sentence[leftWord + i-1] = sentence[rightWord + i];
                    sentence[rightWord + i] = tempCh;
                }
                for (int i = 0; i < diff; i++) {
                    sentence[leftWord + lengthOfWordAtStart + i-1] = temp[i];
                }

            } else {
                for (int i = 0; i < diff; i++) {
                    temp[i] = sentence[currenStart +i]; //copy before rotating left
                }
                //rotate left
                //tate left..
                //tate     leftte
                //   ft         tate
                rotateLeft(sentence, currenStart, currentEnd, diff);
                int rightWord = end -lengthOfWordAtStart;
                int leftWord = currenStart;
                for (int i = 0; i < lengthOfWordAtEnd; i++) {
                   sentence[currentEnd-i]=sentence[currenStart+lengthOfWordAtEnd-i-diff];
                    sentence[currenStart+lengthOfWordAtEnd-i-diff]=sentence[currentEnd-diff-i];
                }
                //is a
                //s aa
                //a  s
                for (int i = 0; i < diff; i++) {
                    sentence[currentEnd-lengthOfWordAtEnd-i]=temp[diff-i-1];
                }

            }
            start=currenStart+lengthOfWordAtEnd;
            while (start<sentence.length&&sentence[start]==SPACE) {
                start++;
            }
            end=currentEnd-lengthOfWordAtStart;
            while (end>0 && sentence[end]==SPACE) {
                end--;
            }
        }
    }

    private void rotateRight(char[] sentence, int start, int end, int diff) {
        System.arraycopy(sentence, start, sentence, diff, end-start);
    }

    private void rotateLeft(char[] sentence, int start, int end, int diff) {
        System.arraycopy(sentence, start+diff, sentence, start, end-start);
    }
}
