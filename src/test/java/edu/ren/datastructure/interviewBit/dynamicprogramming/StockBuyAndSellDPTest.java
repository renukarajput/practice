package edu.ren.datastructure.interviewBit.dynamicprogramming;

import static org.junit.Assert.*;

public class StockBuyAndSellDPTest extends StockBuyAndSellAbstractTest{

    @Override
    protected StockBuyAndSell getStockBuyAndSell() {
        return new StockBuyAndSellDP();
    }
}