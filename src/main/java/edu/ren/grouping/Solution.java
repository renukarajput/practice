package edu.ren.grouping;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.BiConsumer;

public class Solution {

    enum Department {
        IT, QA, AdMIN
    }

    public static void main(String[] args) {
        Map<Department, Double> bankA = new HashMap<>();
        bankA.put(Department.IT, 1000.0);
        bankA.put(Department.AdMIN, 2000.0);
        bankA.put(Department.QA, 3000.0);

        Map<Department, Double> bankB = new HashMap<>();
        bankB.put(Department.IT, 2000.0);
        bankB.put(Department.AdMIN, 1000.0);
        bankB.put(Department.QA, 3000.0);

        Map<Department, Double> bankC = new HashMap<>();
        bankC.put(Department.AdMIN, 2000.0);
        bankC.put(Department.QA, 3000.0);

        Map<Department, Double> result = new HashMap<>();
        BiConsumer<Department, Double> biConsumer = (k, v) -> {
            Double existing = result.get(k) == null ? 0d : result.get(k);
            result.put(k, v + existing);
        };
        bankA.forEach(biConsumer);
        bankB.forEach(biConsumer);
        bankC.forEach(biConsumer);

        /*Iterator<Department> itr = bankA.keySet().iterator();
        Double balance = 0.0;

        while (itr.hasNext()) {
            Department next = itr.next();
            Double b1 = bankA.get(next);
            if (bankB.keySet().contains(next)) {
                Double b2 = bankB.get(next);
                if (bankC.keySet().contains(next)) {
                    Double b3 = bankC.get(next);
                    balance = b1 + b2 + b3;
                    result.put(next, balance);
                } else {
                    balance = b1 + b2;
                    result.put(next, balance);
                }
            }
        }*/
        System.out.println("result map : " + result);
    }


}
