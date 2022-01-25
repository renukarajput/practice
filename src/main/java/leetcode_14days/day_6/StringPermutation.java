package leetcode_14days.day_6;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class StringPermutation {

    //s1=ab , s2=eidbaooo

    public boolean checkInclusion(String s1, String s2) {
        String[] permutations = getAllPermutation(s1);

        List<String> list = Arrays.asList(permutations);
        return list.stream().anyMatch(str -> s2.contains(str));
    }

    private String[] getAllPermutation(String s1) {
//        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
//            sb.append(s1.charAt(i));
            String substring = s1.substring(i,i+1);
            System.out.println("i "+ i + " - "+substring);
        }

        return null;
    }

    static int rand100to200() {
      int i=100+new Random().nextInt(100);
    return i;
    }
//100 0  ,200 10
    static int rand20t030(){
       return 20+(rand100to200()-100)/10;
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
        for (int i = 0; i <20 ; i++) {
            System.out.println(rand20t030());
        }
       /* Scanner scanner=new Scanner(System.in);
        int input=scanner.nextInt();
        if(isArmStrong(input)){
            System.out.println("Armstrong number");
        }else {
            System.out.println("Not Armstrong number");
        }*/
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
