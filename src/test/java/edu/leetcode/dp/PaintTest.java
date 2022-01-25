package edu.leetcode.dp;

import static org.junit.Assert.*;

public class PaintTest extends PaintHousesTest{
    @Override
    protected PaintHouses getPaintHouses() {
        return new Paint();
    }
}