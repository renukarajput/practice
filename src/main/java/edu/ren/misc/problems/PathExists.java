package edu.ren.misc.problems;

import java.util.ArrayList;
import java.util.List;

public class PathExists {

    static String find_path(List<List<String>> matrix, String target_string) {
        List<Character> result = new ArrayList<>();
        final boolean path = find_path(matrix, 0, 0, target_string, 0, result);
        if(!path)
            return "NO PATH";
        StringBuilder s = new StringBuilder();
        for (char c : result) {
            s.append(c);
        }
        return s.toString();
    }

    static boolean find_path(List<List<String>> matrix, int x, int y, String target_string, int targetIndex, List<Character> result) {
        if (targetIndex == target_string.length()-1) {
            return target_string.charAt(targetIndex)==matrix.get(x).get(y).charAt(0);
        }
        if(x==matrix.size()-1 && y==matrix.get(0).size()-1){
            return target_string.charAt(targetIndex)==matrix.get(x).get(y).charAt(0);
        }
        if(x>=matrix.size()||y>=matrix.get(0).size()){
            return false;
        }
        if (matrix.get(x).get(y).charAt(0) == target_string.charAt(targetIndex)) {
            result.add('R');
            if (!find_path(matrix, x, y + 1, target_string, targetIndex + 1, result)) {
                result.remove(result.size() - 1);
            }else {
                return true;
            }
            result.add('D');
            if (!find_path(matrix, x + 1, y, target_string, targetIndex + 1, result)) {
                result.remove(result.size() - 1);
            }else {
                return true;
            }
        }
        return false;
    }
}
