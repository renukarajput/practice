package edu.ren.datastructure.interviewBit.dynamicprogramming;

import static org.junit.Assert.*;

public class IsInterLeavingOfTwoStringDPTest extends IsInterleavingOfTwoStringAbstractTest{

    @Override
    protected IsInterleavingOfTwoString getIsInterleavingOfTwoString() {
        return new IsInterLeavingOfTwoStringDP();
    }
}