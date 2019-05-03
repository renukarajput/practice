package edu.ren.design.patterns.adapter;

public class Socket {
    public Volt getVolt(){
        return new Volt(120);
    }
}
