package edu.ren.design.patterns.adapter;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter {
    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v = getVolt();
        return convertToVolt(v,10);
    }

    @Override
    public Volt get3Volt() {
      Volt v = getVolt();
        return convertToVolt(v, 40);
    }

    private Volt convertToVolt(Volt v, int divisionFactor) {
        return new Volt(v.getVolts()/divisionFactor);
    }
}
