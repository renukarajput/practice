package edu.ren.geeks.programs;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by rrn3194 on 4/20/18.
 */
public class NonRepeatingCharsTest {

    private String getInput() {
        System.out.print("Enter now : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        return input;
    }

    @Test
    public void input1() {
        List<Character> characterList = new ArrayList<>();
        String input = "aaab";

        for (int i = 0; i < input.length(); i++) {
            characterList.add(input.charAt(i));
        }
        assertThat(NonRepeatingChars.getNonRepeatingFirstChar(characterList), is('b'));
    }

    @Test
    public void input2() {

        List<Character> characterList = new ArrayList<>();
        String input = "aaabbdba";

        for (int i = 0; i < input.length(); i++) {
            characterList.add(input.charAt(i));
        }
        assertThat(NonRepeatingChars.getNonRepeatingFirstChar(characterList), is('d'));
    }

    @Test
    public void input3() {

        List<Character> characterList = new ArrayList<>();
        String input = "aacbbeef";

        for (int i = 0; i < input.length(); i++) {
            characterList.add(input.charAt(i));
        }
        assertThat(NonRepeatingChars.getNonRepeatingFirstChar(characterList), is('c'));
    }

    @Test
    public void input4() {

        List<Character> characterList = new ArrayList<>();
        String input = "aaaxaaccyxabde";

        for (int i = 0; i < input.length(); i++) {
            characterList.add(input.charAt(i));
        }
        assertThat(NonRepeatingChars.getNonRepeatingFirstChar(characterList), is('y'));
    }

    @Test
    public void input5() {

        List<Character> characterList = new ArrayList<>();
        String input = "aaa";

        for (int i = 0; i < input.length(); i++) {
            characterList.add(input.charAt(i));
        }
        assertThat(NonRepeatingChars.getNonRepeatingFirstChar(characterList), is(' '));
    }

    @Test
    public void input6() {

        List<Character> characterList = new ArrayList<>();
        String input = "a";

        for (int i = 0; i < input.length(); i++) {
            characterList.add(input.charAt(i));
        }
        assertThat(NonRepeatingChars.getNonRepeatingFirstChar(characterList), is('a'));
    }
}