package edu.ren.hackerrank.stock;

public interface StockStatistic {
    void push(String symbol, Double price);
    int getTickCount(String symbol);
    double getAveragePrice(String symbol);
}
