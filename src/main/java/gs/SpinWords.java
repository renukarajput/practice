package gs;


import java.util.StringJoiner;

public class SpinWords {

    public String spinWords(String sentence) {
        final int wordLengthLimit = 5;
        String[] words = sentence.split(" ");
        StringJoiner result = new StringJoiner(" ");
        for (String str : words) {
            if (str.length() > wordLengthLimit) {
                char[] arr = str.toCharArray();
                reverseString(arr);
                result.add(String.valueOf(arr));
            } else {
                result.add(str);
            }
        }
        return result.toString();
    }

    private void reverseString(char[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            if (!Character.isLetter(arr[start])) {
                start=start+1;
            }
            if (!Character.isLetter(arr[end])) {
                end=end-1;
            }
            swapChars(start, end, arr);
            start++;
            end--;
        }
    }

    private void swapChars(int start, int end, char[] str) {
        char temp = str[start];
        str[start] = str[end];
        str[end] = temp;
    }

}
