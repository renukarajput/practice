package edu.ren.design.patterns.adapter;

public class MidPowerSocket implements Volt {
    static int volt;

    public MidPowerSocket(int v) {
        volt = v;
    }

    @Override
    public int getVolt() {
        return volt;
    }
}
