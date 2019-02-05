package edu.ren.datastructure.interviewBit.stack;

import java.util.*;

public class DirectoryPath {

    // "/a/./b/../../c/", => "/c"

    public String simplify(String input) {

        Deque<String> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        String[] splitArray = input.split("/");

        for (int i = 1; i < splitArray.length; i++) {
            if (splitArray[i].equals("..")) {
                stack.pop();
            } else if (!splitArray[i].equals(".")) {
                stack.push(splitArray[i]);
            }

        }
        while (!stack.isEmpty()) {
            String holder = stack.removeLast();
            sb.append("/").append(holder);

        }
        return sb.toString();
    }
}
