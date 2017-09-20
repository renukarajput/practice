package edu.ren.misc.problems;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharCount {

    public static void getCharWithCount(String input){
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < input.length(); i++) {
            if (!map.containsKey(input.charAt(i)))
                map.put(input.charAt(i), 1);
            else
                map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
        }
        Iterator itr = map.keySet().iterator();
        while(itr.hasNext()) {
            char key = (char)itr.next();
            System.out.print(key+""+map.get(key));
        }
    }

    public static void compressInputStr(String input) {
        int count = 1;
        for (int i = 0; i <= input.length() - 1; i++) {
            if((i == input.length() - 1) || !(input.charAt(i) == input.charAt(i + 1))) {
                System.out.print(input.charAt(i) + "" + count);
                count = 1;
            } else {
                count++;
            }
        }
    }

    public static Character[] compressInput(Character[] inputArr) {
       int writePosition = 0;
        int count = 1;
        for (int readPosition = 0; readPosition <= inputArr.length - 1; readPosition++) {
            if ((readPosition == inputArr.length - 1) || !(inputArr[readPosition] == inputArr[readPosition + 1])) {
                inputArr[writePosition++] = inputArr[readPosition];
                inputArr[writePosition++] = Character.forDigit(count, 10); //(char)
                count = 1;
            } else {
                count++;
            }
        }
        for (int j = writePosition; j < inputArr.length;j++)
            inputArr[j] = null;
        return inputArr;
    }
}
