package array;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicate {

    public int getTheElement(int[] arr) {
        Set<Integer> visitedSet = new HashSet();
        for (int i = 0; i < arr.length; i++) {
            if (!visitedSet.contains(arr[i])) {
                visitedSet.add(arr[i]);
            } else {
                return arr[i];
            }
        }
        return 0;
    }
}
