package edu.ren.design.patterns.adapter;

public class AdapterPatternTest {
    public static void main(String[] args) {
        testClassAdapter();
        testObjectAdapter();
    }

    private static void testObjectAdapter() {
        SocketAdapter socketAdapter = new SocketClassAdapterImpl();
        System.out.println(socketAdapter.get3Volt().getVolts());
        System.out.println(socketAdapter.get12Volt().getVolts());
        System.out.println(socketAdapter.get120Volt().getVolts());
    }

    private static void testClassAdapter() {
        SocketAdapter socketAdapter = new SocketObjectAdapterImpl();
        System.out.println(socketAdapter.get3Volt().getVolts());
        System.out.println(socketAdapter.get12Volt().getVolts());
        System.out.println(socketAdapter.get120Volt().getVolts());
    }
}
