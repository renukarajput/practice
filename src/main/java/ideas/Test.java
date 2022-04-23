package ideas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class BadArgsException extends MyException {
}

class MyException extends Throwable {
}

class Except {
    public static boolean checkArgs(String[] args) throws BadArgsException {
        if (args.length != 2) {
            throw new BadArgsException();
        }
//        OtherStuff.calculate(args);
        return true;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 6, 1, 3, 7,1,9, 9);
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,11);
        map.put(2,31);
        map.put(3,21);


        //System.out.println(list.stream().distinct().collect(Collectors.toList()));


        // 4 5 7 7 4
        //
    }
}
