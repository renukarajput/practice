package leetcode_14days.day4;


public class ReverseWords {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
//        String s1 = "Hello, how are you?";
//        System.out.println(reverseWords(s1));
    }

    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        char[] chars={};
        for (String word : words) {
            chars = word.toCharArray();
            StringReversal.reverseString(chars);
            sb = sb.append(String.valueOf(chars)).append(" ");

        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}
