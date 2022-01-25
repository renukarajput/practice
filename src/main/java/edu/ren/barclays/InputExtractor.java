package edu.ren.barclays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rrn3194 on 10/25/18.
 */
public class InputExtractor {

    List<Currency> getCurrencyList() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numberOfTests = br.readLine();
        int noOfTests = Integer.parseInt(numberOfTests);
        List<Currency> currencyList = new ArrayList<>();
        for (int i = 0; i < noOfTests; i++) {
            String line = br.readLine();
            String[] split = line.split(" ");
            Currency currency;
            if (split[0].equals("Note")) {
                currency = new Note(Integer.parseInt(split[1]));
            } else {
                currency = new Coin(Integer.parseInt(split[1]));
            }
            currencyList.add(currency);
        }
        return currencyList;
    }
}
