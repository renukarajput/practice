package scratch;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static scratch.Main.*;

class MainTest {

    @Test
    public  void test () {
        String[] args = new String[] {"baseball", "a,all,b,ball,bas,base,cat,code,d,e,quit,z"};
        // keep this function call here
        //Scanner s = new Scanner(System.in);
//        System.out.print(ArrayChallenge(args));
        // String result=ArrayChallenge(s.nextLine());
        String result = ArrayChallenge(args);
       
        System.out.print(reverse( new StringJoiner(":",ChallengeToken, result).toString()));
    }
    
    @Test
    public void m1(){
        Integer[] a = {1,2,3};
        List<Integer> list = new ArrayList<>();

        for (int i : a) {
            list.add(i);
        }
        Integer sum = list.stream().reduce(0, (e1, e2) -> e1 + e2);
        System.out.println(list);
    }
}