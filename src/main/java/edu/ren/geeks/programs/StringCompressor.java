package edu.ren.geeks.programs;


import java.util.ArrayList;
import java.util.List;

public class StringCompressor {
    public static void getCompressed(char[] input) {  //aabbcc
        int length = input.length - 1;
        int count = 1;
        for (int i = 0; i <= length; i++) {
            if (i == length || !(input[i] == input[i+1])){
                System.out.print(input[i]+""+count);
                count = 1;
            }else {
                count++;
            }
        }
    }

    public static int getCompressedArray(char[] input) {
        int length = input.length - 1;
        int count = 1;
        int writePosition = 0;
        for (int readPosition = 0; readPosition <= length; readPosition++) {
            if (readPosition == length || !(input[readPosition] == input[readPosition+1])){
                input[writePosition++] = input[readPosition];
//               List<Integer> digits = getDigitArrayForInt(count);
                char[] digits = String.valueOf(count).toCharArray();
                if (count > 9){
                    for (int j = 0; j < digits.length; j++) {
                        input[writePosition++] = Character.forDigit(Character.getNumericValue(digits[j]),10);
                    }
                }else{
                    input[writePosition++] = Character.forDigit(count,10);
                }
                count = 1;
            }else{
                count++;
            }
        }
        return writePosition;
    }

     static List<Integer> getDigitArrayForInt(int number) { //6532
        List<Integer> list = new ArrayList<>();
       // Integer[] integers = list.toArray(new Integer[list.size()]);
        while(number > 0){
            list.add(0,number % 10);
            number = number / 10;
        }
        return list;
    }
}

