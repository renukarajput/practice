package edu.ren.design.patterns.Factory;

/**
 * Created by rrn3194 on 10/20/18.
 */
public class FactoryMain {

    public static void main(String[] args) {
        AccountFactory factory = new AccountFactory();
        Account acc = factory.getAccount("current");

    }
}
