package leetcode_14days.day_6;

import java.util.Arrays;
import java.util.List;

public class StringPermutation {

    public boolean checkInclusion(String s1, String s2) {
        String[] permutations = getAllPermutation(s1);
        List<String> list = Arrays.asList(permutations);
        return list.stream().anyMatch(str -> s2.contains(str));
    }

    private String[] getAllPermutation(String s1) {
        for (int i = 0; i < s1.length(); i++) {
            String substring = s1.substring(i,i+1);
            System.out.println("i "+ i + " - "+substring);
        }
        return null;
    }

    int find(char[] strMain,char[] strFind){

        int count=0;
        for (int i = 0; i <strMain.length ; i++) {
            int first=i,second=0;
            while (strMain[first]==strFind[second]){
                first++;
                second++;
                if(second==strFind.length){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {

    }

    static boolean isArmStrong(int number){
        int sum=0;
        int num=number;
        while (num>0){
            int digit=num%10;
            sum+=digit*digit*digit;
            num=num/10;
            System.out.println(sum);
        }
        return sum==number;
    }
}
