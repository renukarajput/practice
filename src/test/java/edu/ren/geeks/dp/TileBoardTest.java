package edu.ren.geeks.dp;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class TileBoardTest {
TileBoard tileBoard=new TileBoard();

@Test
    public void numways() {
        assertThat(tileBoard.numways(3),is(3));
    }

    @Test
    public void numways_1() {
         String a = "foo"; String b = "food".substring(0,3);
         String c = b.intern();
         boolean res=a == c;
        System.out.println(res);
        System.out.println(f());
        assertThat(tileBoard.numways(4),is(5));
    }
    boolean f(){
        try {
            return true;
        } finally {
            return false;
        }
    }
}