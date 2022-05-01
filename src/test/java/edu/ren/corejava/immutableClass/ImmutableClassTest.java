package edu.ren.corejava.immutableClass;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ImmutableClassTest {
    ImmutableClass immutableClass = new ImmutableClass(10, "Renuka");

    @Test
    public void testFields(){
        assertThat(immutableClass.getId(), is(10));
        assertThat(immutableClass.getName(), is("Renuka"));
    }
}
