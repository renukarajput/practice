package edu.ren.corejava.immutableClass;

final public class ImmutableClass {
    private final int id;
    private final String name;


    public ImmutableClass(int id, String name) {
        System.out.println("Performing Deep Copy for Object initialization");
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
