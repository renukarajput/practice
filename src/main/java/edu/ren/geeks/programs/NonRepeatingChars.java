package edu.ren.geeks.programs;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.*;

/**
 * Created by rrn3194 on 4/18/18.
 */
public class NonRepeatingChars {
    public static void main(String[] args) {

        String input = null;
        List<Character> characterList = new ArrayList<>();
        Map<Character,Boolean> linkedHashMap = new LinkedHashMap<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter now : "); //aaabaaccdabde
        input = scanner.nextLine();

        for(int i = 0; i < input.length(); i++) {
            characterList.add(input.charAt(i));
        }

        characterList.stream().forEach(key -> {
            if(linkedHashMap.containsKey(key)) linkedHashMap.put(key,false); else linkedHashMap.put(key,true);
        });

        if (linkedHashMap.containsValue(true)){
            for (Map.Entry<Character, Boolean> e : linkedHashMap.entrySet()){
                if (e.getValue().equals(true)){
                    System.out.println("1st non repeating char : "+ e.getKey());
                    break;
                }
            }
        }

    }
}
