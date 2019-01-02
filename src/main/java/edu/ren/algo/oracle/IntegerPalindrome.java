package edu.ren.algo.oracle;

public class IntegerPalindrome {

    // num=7557
    // Integer val = 7557; //557
    //7679
    //while val > 10 val=val/10  //num%10
    // /val is 7 first digit ,num%10 last digit
    //num=num%10^len 557 num=num/10 55

    public boolean isPalindromeRec1(Integer number) {
        if (number == 0) {
            return true;
        }
        int length = 0;
        int firstDigit = number;
        int lastDigit = number % 10;
        while (firstDigit > 10) {
            firstDigit = firstDigit / 10;
            length++;
        }
        if (lastDigit != firstDigit) {
            return false;
        }
        int base = (int) Math.pow(10, length);
        number = number % base;
        number = number / 10;
        return isPalindromeRec(number);
    }

    public boolean isPalindromeRec(Integer number) {
        while(number > 0) {
            int length = 0;
            int firstDigit = number;
            int unitDigit = number % 10;
            while (firstDigit > 10) {
                firstDigit = firstDigit / 10;
                length++;
            }
            if (unitDigit != firstDigit) {
                return false;
            }
            int base = (int) Math.pow(10, length);
            number = number % base;
            number = number / 10;
        }
        return true;
    }
}
