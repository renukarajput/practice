package edu.ren.geeks.programs;

import java.util.*;

/**
 * Created by rrn3194 on 4/18/18.
 */
public class NonRepeatingChars {
    private void temp() {
        // Arrays.<Character>asList((Character[]) input.toCharArray(new Character[input.length()]));
//   List<Map.Entry<Character, Boolean>> collect = linkedHashMap.entrySet().stream().filter(x -> x.getValue() == true).collect(Collectors.toList());

    }

    public static Character getNonRepeatingFirstChar(List<Character> characterList) {
        Map<Character, Boolean> map = new LinkedHashMap<>();
        Set<Character> duplicates = new HashSet<>();

        characterList.stream().forEach(key -> {
            if (map.containsKey(key) && !duplicates.contains(key)) {
                map.remove(key);
                duplicates.add(key);
            }else if(duplicates.contains(key) && !map.containsKey(key)){
                duplicates.add(key);
            } else {
                map.put(key, true);
            }
        });
        if (map.entrySet().iterator().hasNext())
            return map.entrySet().stream().findFirst().get().getKey();
        else
            return ' ';
    }
}