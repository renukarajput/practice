package edu.ren.design.patterns.Factory;

/**
 * Created by rrn3194 on 10/20/18.
 */
public class AccountFactory {
    final String current = "CURRENT";

    public Account getAccount(String accType){
        if (accType.equals(current))
            return new CurrentAccount();
        else
            return new SavingAccount();
    }
}
