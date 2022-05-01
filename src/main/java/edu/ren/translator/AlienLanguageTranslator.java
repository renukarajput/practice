package edu.ren.translator;

public class AlienLanguageTranslator implements LanguageTranslator {
    //65 68
    // 89 92
    //65
    @Override
    public String fromDefaultLanguage(String languageTokens) {
        // english to another
        String str = "";
        for (int i = 0; i < languageTokens.length(); i++) {
            char ch = languageTokens.charAt(i);
            int low = Character.isLowerCase(ch) ? 97 : 65;//or 97
            int highLimit = low + 25;//or
            int newVal = ch + 3;
            if (newVal > highLimit) {
                int diff = newVal - highLimit;
                int c = low + diff - 1;
                str += (char) c;
            } else {
                int ints = ch + 3;
                str += (char) ints;
            }
        }
        return str;
    }
// C 67--64


    @Override
    public String toDefaultLanguage(String languageTokens) {
        String str = "";
        for (int i = 0; i < languageTokens.length(); i++) {
            char ch = languageTokens.charAt(i);
            int low = Character.isLowerCase(ch) ? 97 : 65;
            int highLimit = low + 25;//or
            int newVal = ch - 3;
            if (newVal < low) {
                int diff = low - newVal;
                int c = highLimit - diff +1;
                str += (char) c;
            } else {
                int ints = ch - 3;
                str += (char) ints;
            }
        }
        return str;
    }

}
