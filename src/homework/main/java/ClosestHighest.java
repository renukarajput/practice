package homework.main.java;

import java.util.Stack;

public class ClosestHighest {

    public static void getClosestHighestNumber(int[] inputArr) {
        int len = inputArr.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (inputArr[j] > inputArr[i] && (j > i))
                    System.out.println(inputArr[i]+" "+ inputArr[j]);
            }
        }
    }
}
