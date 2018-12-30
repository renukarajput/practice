package edu.ren.datastructure.interviewBit.dynamicprogramming;

import static org.junit.Assert.*;

public class CoinChangeWaysDPTest extends CoinChangeWaysAbstractTest{

    @Override
    protected CoinChangeWaysDP getCoinChangeWaysRecursive() {
        return new CoinChangeWaysDP();
    }
}