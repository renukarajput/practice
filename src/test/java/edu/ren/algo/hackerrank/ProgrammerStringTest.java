package edu.ren.algo.hackerrank;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProgrammerStringTest {

    @Test
    public void programmerStrings() {
        int c = ProgrammerString.programmerStrings("programmerprogrammer");
        System.out.println(c);

    } @Test
    public void programmerStrings1() {
        int c = ProgrammerString.programmerStrings("progxrammerrxproxgrammer");
        System.out.println(c);
    }
}