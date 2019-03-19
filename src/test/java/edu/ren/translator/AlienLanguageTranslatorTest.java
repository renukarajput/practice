package edu.ren.translator;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class AlienLanguageTranslatorTest {

    AlienLanguageTranslator al = new AlienLanguageTranslator();

    @Test
    public void fromDefaultLanguage_1() {
        assertThat(al.fromDefaultLanguage("Java"), is("Mdyd"));
    }

    @Test
    public void fromDefaultLanguage_2() {
        assertThat(al.fromDefaultLanguage("Python"), is("Sbwkrq"));
    }

    //Python  Sbwkrq
    @Test
    public void toDefaultLanguage_1() {
        assertThat(al.toDefaultLanguage("Mdyd"), is("Java"));
    }

    @Test
    public void toDefaultLanguage_2() {
        assertThat(al.toDefaultLanguage("Sbwkrq"), is("Python"));
    }
}