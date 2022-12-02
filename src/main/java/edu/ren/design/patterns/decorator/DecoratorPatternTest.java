package edu.ren.design.patterns.decorator;

import java.io.*;

public class DecoratorPatternTest {

    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n***********");
        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
        try {
            final BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("")));
            final InputStream inputStream = (new BufferedInputStream(new FileInputStream("")));
            final Reader bf = new BufferedReader(new InputStreamReader(System.in));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
