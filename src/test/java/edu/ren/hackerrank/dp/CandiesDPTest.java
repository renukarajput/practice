package edu.ren.hackerrank.dp;

import static org.junit.Assert.*;

public class CandiesDPTest extends CandiesAbstractTest{

    @Override
    protected Candies getCandies() {
        return new CandiesDP();
    }
}