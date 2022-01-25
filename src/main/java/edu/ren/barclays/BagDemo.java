package edu.ren.barclays;

import java.util.List;


public class BagDemo {

    public static void main(String[] args) throws Exception {
        InputExtractor inputExtractor = new InputExtractor();
        List<Currency> currencyList = inputExtractor.getCurrencyList();
        CurrencyVisitor currencyVisitor = new CurrencyVisitor();

        for (Currency c : currencyList) {
            c.accept(currencyVisitor);
        }
        Bag b = new Bag(currencyVisitor);
        b.display();
    }

    /*public static void main(String args[]) {
        Stream<double[]> TriplesValue = IntStream.rangeClosed(1, 100)
                .boxed().flatMap(a ->IntStream.rangeClosed(a, 10)
                        .mapToObj(
                                b -> new double[] {a,b, Math.sqrt(a * a + b * b)})
                        .filter (t -> t[2] % 1 == 0));

        TriplesValue.limit(5)
                .forEach(t-> System.out.println(t[0] + ", " + t[1] + ", " + t[2]));
    }*/
}
