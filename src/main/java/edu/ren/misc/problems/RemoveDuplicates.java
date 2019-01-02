package edu.ren.misc.problems;

/**
 * Created by rrn3194 on 6/5/16.
 */
public class RemoveDuplicates {
    public String remove(String str) {
        String input = str.toLowerCase();
        StringBuilder sb = new StringBuilder();

        return removeRecursively(input, sb, 0);
    }

    private String removeRecursively(String input, StringBuilder sb, int i) {
        if (i > input.length() - 1) {
            return sb.toString();
        }
        if (i == input.length() - 1) {
            if (input.charAt(i - 1) != input.charAt(i)) {
                sb.append(input.charAt(i));
            }
            return sb.toString();
        }

        if (input.charAt(i) != input.charAt(i + 1)) {
            if (i == 0 || input.charAt(i - 1) != input.charAt(i)) {
                sb.append(input.charAt(i));
            }
            removeRecursively(input, sb, i + 1);
        } else {
            removeRecursively(input, sb, i + 2);
        }

        return sb.toString();
    }
}
