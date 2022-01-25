package edu.ren.translator;

public interface LanguageTranslator {
    String DEFAULT_TRANSLATION = "EN";

    // Translates the language from default language
    String fromDefaultLanguage(String languageTokens);

    // Translates the language to default language
    String toDefaultLanguage(String languageTokens);
}

