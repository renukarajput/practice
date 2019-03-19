package edu.ren.misc.problems;

public class ShopkeeperPurchase {
    public int canSell(int[] input) {
        int priceOfEachItem = 5;
        int amountAvailable = 0;
        int amountToReturn = 0;
        for (int i = 0; i < input.length; i++) {
            amountToReturn = input[i] - priceOfEachItem;
            if (amountAvailable < amountToReturn) {
                return i + 1;
            } else {
                amountAvailable += priceOfEachItem;
            }
        }
        return 0;
    }
}
