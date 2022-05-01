package edu.ren.hackerrank;

import java.util.ArrayList;
import java.util.List;
public class CamelCase {
    public static void main(String[] args) {
        String input = "saveChangesInTheEditorIdea";
        getTheWords(input);
    }

    private static void getTheWords(String input) {
        char aChar;
        List <Integer> startIndexList = new ArrayList<>();
        startIndexList.add(0);
        for (int i = 0; i < input.length(); i++) {
            aChar = input.charAt(i);
            if(aChar >= 65 && aChar <= 90) {
                startIndexList.add(i);
            }
        }
        startIndexList.add(input.length());
        System.out.println(startIndexList.size()-1);
        for(int j = 0;j < startIndexList.size()-1;j++){
            System.out.println(input.substring(startIndexList.get(j),startIndexList.get(j+1)));
        }
    }
}
