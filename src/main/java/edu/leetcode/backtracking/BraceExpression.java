package edu.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BraceExpression {
    public String[] expand(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        List<String> result = new ArrayList<>();
        expand(s, 0, stringBuilder, result,false);
        Collections.sort(result, String::compareTo);
        return result.toArray(new String[result.size()]);
    }

    private void expand(String s, int index, StringBuilder stringBuilder, List<String> result,boolean in) {
        if (index == s.length()) {
            result.add(stringBuilder.toString());
            return;
        }

        if (s.charAt(index) == '{') {
            int end = index;
            while (s.charAt(++end) != '}') ;

            for (int i = index + 1; i <end; i++) {
                if (s.charAt(i) == ',')
                    continue;
                stringBuilder.append(s.charAt(i));
                expand(s, end + 1, stringBuilder, result,true);
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);

            }
        } else {
            stringBuilder.append(s.charAt(index));
            expand(s, index + 1, stringBuilder,result,false);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);

        }
    }
}
