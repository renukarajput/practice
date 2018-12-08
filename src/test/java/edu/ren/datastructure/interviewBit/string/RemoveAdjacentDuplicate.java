package edu.ren.datastructure.interviewBit.string;

public class RemoveAdjacentDuplicate {
    String remove(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        remove(str.toCharArray(), 0, stringBuilder);
        return stringBuilder.toString();
    }

    private void remove_(char[] str, int index, StringBuilder stringBuilder) {
        if (index > str.length - 1) {
            return;
        }


        while (index < str.length - 1 && str[index] == str[index + 1]) {
            index++;
        }

        if (index == 0 || str[index] != str[index - 1]) {
            stringBuilder.append(str[index]);
        }
        remove(str, index+1, stringBuilder);
    }

    private void remove(char[] str, int index, StringBuilder stringBuilder) {
        if (index > str.length - 1) {
            return;
        }

        if (index == str.length - 1) {
            if (stringBuilder.length() > 0 && str[index] == stringBuilder.charAt(stringBuilder.length() - 1)) {
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                return;
            } else {
                stringBuilder.append(str[index]);
            }
        }


        if (str[index] != str[index + 1]) {
            if (index == 0 || str[index - 1] != str[index]) {
                if (stringBuilder.length() > 0 && str[index] == stringBuilder.charAt(stringBuilder.length() - 1)) {
                    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                } else {
                    stringBuilder.append(str[index]);
                }

            }
            remove(str, index + 1, stringBuilder);
        } else {
            remove(str, index + 2, stringBuilder);
        }

    }
}
