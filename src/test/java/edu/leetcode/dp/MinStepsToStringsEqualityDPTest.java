package edu.leetcode.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinStepsToStringsEqualityDPTest extends MinStepsToStringsEqualityTest{


    @Override
    protected MinStepsToStringsEquality getMinStepsToStringsEquality() {
        return new MinStepsToStringsEqualityDP();
    }
}