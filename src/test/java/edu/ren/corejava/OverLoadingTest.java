package edu.ren.corejava;

import edu.ren.comparison.Employee;
import edu.ren.comparison.Human;
import edu.ren.comparison.Labour;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * Created by rrn3194 on 9/6/18.
 */
public class OverLoadingTest {
    @Test
    public void t1(){
        Integer[] a={1,2,3,4,5,6,7,8,9};
        final List<Integer> list = Arrays.asList(a);
        list.forEach(i->{
            if(i==3){
                return;
            }
            System.out.println(i);
        });
    }
    @Test
    public void testOverloadingAmbigious() {
        // fun(null);
    }

    final void fun(Integer i) {
        System.out.println(i);
    }

    final void fun(String s) {
        System.out.println(s);
    }

    @Test
    public void testOverloadingWithSubtype() {
        call(new Employee("name", 10000, 27));
    }

    //Type erasure
    // void func(List<String> students){};
    void func(List<Integer> students) {
    }

    ;

    void func(Set<String> students) {
    }

    ;

    final Human call(Human s) {
        System.out.println("human " + s);
        return s;
    }

    final Labour call(Labour s) {
        System.out.println("labour " + s);
        return s;
    }

}