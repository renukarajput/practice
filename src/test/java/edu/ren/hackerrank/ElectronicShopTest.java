package edu.ren.hackerrank;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ElectronicShopTest {

    ElectronicShop electronicShop = new ElectronicShop();

    @Test
    public void input_1() {
        int[] keyboards = {40, 50, 60};
        int[] drives = {5, 8, 12};
        int moneySpent = electronicShop.getMoneySpent(keyboards, drives, 60);
        assertThat(moneySpent, is(58));
    }

    @Test
    public void input_2() {
        int[] keyboards = {3, 1};
        int[] drives = {5, 2, 8};
        int moneySpent = electronicShop.getMoneySpent(keyboards, drives, 10);
        assertThat(moneySpent, is(9));
    }

    @Test
    public void input_3() {
        int[] keyboards = {4};
        int[] drives = {5};
        int moneySpent = electronicShop.getMoneySpent(keyboards, drives, 5);
        assertThat(moneySpent, is(-1));
    }

    @Test
    public void input_4() {
        int[] keyboards = {1, 3, 5, 7, 9, 100, 110, 120};
        assertThat(electronicShop.closestElement(keyboards, 2), is(3));
        assertThat(electronicShop.closestElement(keyboards, 117), is(120));
        assertThat(electronicShop.closestElement(keyboards, 150), is(120));
        assertThat(electronicShop.closestElement(keyboards, 90), is(100));

    }
    @Test
    public void input_5() {
        int[] keyboards = {1, 3, 5, 7, 9, 100, 110, 120};
        assertThat(electronicShop.closestElement(keyboards, 90), is(100));
    }

    @Test
    public void input_6() {
        int[] keyboards = {1, 3, 5, 7, 9, 100, 110, 120};
        assertThat(electronicShop.closestElement(keyboards, 100), is(100));
    }
}