package homework.main.test;

import homework.main.java.Fibb;
import org.junit.Test;

/**
 * Created by rrn3194 on 10/13/16.
 */
public class FibbTest {
    @Test
    public void getNthFibbNumberInput1(){
        System.out.println("Result== "+Fibb.getNthFibbNumber(19));
    }

    @Test
    public void getNthFibbNumberInput2(){
        System.out.println("Result== "+Fibb.getNthFibbNumber(0));
    }
}
