package edu.ren.datastructure.sumoLogic;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class NumberOfWaysInClassTest {
    NumberOfWaysInClass numberOfWaysInClass=new NumberOfWaysInClass();
    @Test
    public void getNumWays() {
   assertThat(numberOfWaysInClass.get(3,2,1),is(1));
    }


 @Test
    public void getNumWays_1() {
   assertThat(numberOfWaysInClass.get(60670,20621,80111),is(800262401));
    }
}