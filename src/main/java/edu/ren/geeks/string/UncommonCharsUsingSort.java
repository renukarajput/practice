package edu.ren.geeks.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UncommonCharsUsingSort {

    public Set<Character> findUncommonChars(String str1, String str2) {
        char[] input1 = str1.toCharArray();
        char[] input2 = str2.toCharArray();

        Arrays.sort(input1);
        Arrays.sort(input2);
        int i = 0, j = 0;
        Set<Character> resultSet = new HashSet();
        Set<Character> visited = new HashSet();
        while ((i < input1.length) && (j < input2.length)) {
            if (input1[i] == input2[j]) {
                visited.add(input1[i]);
                i++;
                j++;
            } else if (input1[i] < input2[j]) {
                if (visited.contains(input1[i])) {
                    i++;
                } else {
                    resultSet.add(input1[i]);
                    i++;
                }
            } else {
                resultSet.add(input2[j]);
                j++;
            }
        }

        while (i < input1.length) {
            resultSet.add(input1[i]);
            i++;
        }
        while (j < input2.length) {
            resultSet.add(input2[j]);
            j++;
        }
        System.out.println("unique " + resultSet);
        System.out.println("common " + visited);
        return resultSet;
    }
}