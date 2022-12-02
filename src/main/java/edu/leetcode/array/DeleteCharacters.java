package edu.leetcode.array;

import java.util.Stack;

//https://leetcode.com/problems/delete-characters-to-make-fancy-string/
public class DeleteCharacters {
    public String makeFancyString(String str) {
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) { // leeetcode
                count++;
            } else {
                sb.append(str.charAt(i));
                if (count > 1)
                    sb.append(str.charAt(i));
                count = 1;
            }
            System.out.println(sb + " cnt = " + count);
        }
        return sb.toString();
    }
//abbaca
}
