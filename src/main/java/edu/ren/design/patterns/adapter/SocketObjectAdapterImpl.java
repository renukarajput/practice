package edu.ren.design.patterns.adapter;

public class SocketObjectAdapterImpl implements SocketAdapter {
    private Socket sock = new Socket();
    @Override
    public Volt get120Volt() {
        return sock.getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v = sock.getVolt();
        return convertToVolt(v, 10);
    }

    @Override
    public Volt get3Volt() {
        Volt v = sock.getVolt();
        return convertToVolt(v,40);
    }

    private Volt convertToVolt(Volt v, int divisionFactor) {
        return new Volt(v.getVolts()/divisionFactor);
    }
}
