package java8apis;

import edu.ren.comparison.Employee;

import java.util.*;

public class StreamApi {

    Integer[] arr = {2, 3, 4, 6, 5, 7};
    List<Integer> list = Arrays.asList(arr);

    public static void main(String[] args) {
        List<Optional<Object>> optionalList = new ArrayList<>();
//        boolean check = optionalList.add(new Optional("renuka"));
        for (int i = 0; i < 10; i++) {
            final int j = i;
            Runnable r1 = () ->
                    System.out.println("j : " + j);

            Thread t = new Thread(r1, "");
            t.start();

            Map<Employee, Integer> map = new HashMap<>();
            Iterator<Map.Entry<Employee, Integer>> iterator = map.entrySet().iterator();
            while(iterator.hasNext()){
                Map.Entry<Employee, Integer> entry = iterator.next();
                System.out.println(entry.getKey());
            }

        }
    }
}
