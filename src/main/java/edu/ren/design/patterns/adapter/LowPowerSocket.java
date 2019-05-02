package edu.ren.design.patterns.adapter;

public class LowPowerSocket implements Volt {
    static int volt;

    public LowPowerSocket(int v) {
        volt = v;
    }

    @Override
    public int getVolt() {
        return volt;
    }
}
