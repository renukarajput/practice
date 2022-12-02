package scratch;

import java.util.*;

class Main {

    public static final String ChallengeToken = "akch4jl8d51e";

    public static String ArrayChallenge(String[] strArr) {
        // code goes here
        Set<String> dictionary  = new HashSet(Arrays.asList(strArr[1].split(","))) ;
        String word = strArr[0];

        for(int i=0; i < word.length(); i++) {
            String partOne =  word.substring(0,i);
            String partTwo = word.substring(i);
            if(dictionary.contains(partOne) && dictionary.contains(partTwo)){
                return partOne+","+partTwo;
            }
        }
        return "not possible";
    }




    public static String reverse(String input) {
        int start = 0;
        int end = input.length()-1;
        char[] array = input.toCharArray();
        while(start < end) {
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return new String(array);

    }

}


//new String[] {"baseball", "a,all,b,ball,bas,base,cat,code,d,e,quit,z"}

