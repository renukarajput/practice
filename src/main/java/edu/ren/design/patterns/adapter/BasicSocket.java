package edu.ren.design.patterns.adapter;

public class BasicSocket implements Volt {
    static int volt;

    public BasicSocket(int v) {
        volt = v;
    }

    @Override
    public int getVolt() {
        return volt;
    }
}
