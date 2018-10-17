package edu.ren.corejava;

import edu.ren.comparison.Human;
import edu.ren.comparison.Labour;
import org.junit.Test;

/**
 * Created by rrn3194 on 9/7/18.
 */
public class OverridingDemo {
    @Test
    public void test() {
        Human human = new Labour("abc", 2000, 29);
        human.getSocialStatus();
        human.getOrigin();
    }
}

//v-->