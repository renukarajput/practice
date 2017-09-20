package edu.ren.misc.problems;

import org.junit.Test;

public class PangramTest {

    @Test
    public void Input1() {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("enter input:");
        String sentence = sc.nextLine();
        */
        String sentence = "We promptly judged antique ivory buckles for the next prize";
        sentence = sentence.toLowerCase();
        System.out.println(PangramSolution.pangramChecker(sentence));
    }


    @Test
    public void Input2() {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("enter input:");
        String sentence = sc.nextLine();
        */
        String sentence = "We promptly judged antique ivory buckles for next prize";
        sentence = sentence.toLowerCase();
        System.out.println(PangramSolution.pangramChecker(sentence));
    }

}
