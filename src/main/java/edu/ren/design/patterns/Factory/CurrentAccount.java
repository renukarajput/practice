package edu.ren.design.patterns.Factory;

/**
 * Created by rrn3194 on 10/20/18.
 */
public class CurrentAccount implements Account{
    @Override
    public String getAccount() {
        return "CURRENT";
    }
}
