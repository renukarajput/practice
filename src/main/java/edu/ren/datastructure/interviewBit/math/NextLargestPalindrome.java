package edu.ren.datastructure.interviewBit.math;

public class NextLargestPalindrome {

    public int get(int num) {
        for (int i = num + 1; ; i++) {
            if (isPalindrome(i)) {
                return i;
            }
        }
    }

    private boolean isPalindrome(int num) {
        String value = String.valueOf(num);
        int rev_num = 0;
        while(num > 0)
        {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
//        int reverse = new ReverseNumber().reverse(num);
        if (value.equals(String.valueOf(rev_num))) {
            return true;
        }
        return false;
    }

    private String reverse(int value) {
        return new StringBuilder(value).reverse().toString();
    }
}
