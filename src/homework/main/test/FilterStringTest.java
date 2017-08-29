package homework.main.test;

import homework.main.java.FilterString;
import org.junit.Test;


/**
 * Created by rrn3194 on 6/5/16.
 */
public class FilterStringTest {

    @Test
    public void filterInput1(){
        String str = "abcd $000005asdf";
        int index = FilterString.get$IndexFromInput(str);
        String out = String.valueOf(FilterString.getDigitsFromInput(index, str));
        FilterString.ignoreInitialZeros(out);
    }

    @Test
    public void filterInput2(){
        String str = "abcd $10001abcdef";
        int index = FilterString.get$IndexFromInput(str);
        String out = String.valueOf(FilterString.getDigitsFromInput(index, str));
        FilterString.ignoreInitialZeros(out);
    }

    @Test
    public void filterInput3(){
        String str = "abcd $0015aa0012";
        int index = FilterString.get$IndexFromInput(str);
        String out = String.valueOf(FilterString.getDigitsFromInput(index, str));
        FilterString.ignoreInitialZeros(out);
    }

    @Test
    public void filterInput4(){
        String str = "$0000000000";
        int index = FilterString.get$IndexFromInput(str);
        String out = String.valueOf(FilterString.getDigitsFromInput(index, str));
        FilterString.ignoreInitialZeros(out);
    }

}
