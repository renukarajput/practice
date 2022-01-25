package edu.ren.datastructure.interviewBit.dynamicprogramming;

import static org.junit.Assert.*;

public class CoinChangeByMinimumCoinsDPTest extends CoinChangeByMinimumCoinsAbstractTest{

    @Override
    protected CoinChangeByMinimumCoins getCoinChangeByMinimumCoins() {
        return new CoinChangeByMinimumCoinsDP();
    }
}