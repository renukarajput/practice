package edu.ren.geeks.string;

public class ReverseWords {

    public String reverseWordByWord(String input) {
        String[] array = input.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = array.length - 1; i >= 0; i--) {
//            output += array[i]+" ";
            sb.append(array[i] + " ");
        }
        return sb.substring(0, sb.length() - 1);
    }

    public String reverseWordByWord(char[] input) {
        int i = 0;
        int j = i;
        while (i < input.length - 1) {
            while (j < input.length && input[j] != ' ') {
                j++;
            }
            reverse(input, i, j-1);
            while (j < input.length && input[j] == ' ') {
                j++;
            }
            i = j;
        }
        reverse(input, 0, input.length - 1);

        return new String(input);
    }

    private void reverse(char[] input, int start, int end) {
        while (start <= end) {
            char temp = input[start];
            input[start] = input[end];
            input[end] = temp;
            start++;
            end--;
        }
    }
}
