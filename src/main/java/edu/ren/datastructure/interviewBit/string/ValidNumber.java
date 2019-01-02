package edu.ren.datastructure.interviewBit.string;

// https://www.interviewbit.com/problems/valid-number/
public class ValidNumber {
    public static int isValidNumber(String input) {
//            return (input.matches("\\s*[\\-+]?([0-9]*\\.?)?[0-9]+(e[\\-+]?[0-9]+)?\\s*")) ? 1 : 0;
        boolean isExponent = false;
        boolean isDecimal = false;
        boolean isDigit = false;
        boolean isNotLeadingSpace = false;
        for (int i = 0; i <= input.length() - 1; i++) {
            if (Character.isDigit(input.charAt(i))) {
                isDigit = true;
            }
            if (i == input.length() - 1 && input.charAt(i) == '.') {
                return 0;
            }
            if (i == input.length() - 1 && !isDecimal && !isExponent && !isDigit) {
                return 0;
            }
            if (input.charAt(i) == '-') {
                if (i == 0 || input.charAt(i - 1) == 'e') {
                    continue;
                } else {
                    return 0;
                }
            }
            if (isNotLeadingSpace && input.charAt(i) != ' ') {
                return 0;
            }
            if (input.charAt(i) == ' ') {
                if (!isDecimal && !isExponent && !isDigit) {
                    continue;
                }
                isNotLeadingSpace = true;
                continue;
            }
            if (!(input.charAt(i) == 'e' || input.charAt(i) == '.' || Character.isDigit(input.charAt(i)))) {
                return 0;
            }
            if (input.charAt(i) == 'e') {
                if (isExponent) {
                    return 0;
                }
                isExponent = true;
            }
            if (input.charAt(i) == '.') {
                if (isDecimal || isExponent)
                    return 0;
                if(i < input.length()-1 && !Character.isDigit(input.charAt(i+1))){
                   return 0;
                }
                isDecimal = true;
            }

        }
        return 1;
    }

}
