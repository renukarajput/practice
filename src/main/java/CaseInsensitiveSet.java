import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class CaseInsensitiveSet {
    public static void main(String[] args) throws IOException {
        String s= new String("q");
        FileWriter tmp = new FileWriter("tmp");
        tmp.write("abcd");
        tmp.close();
        new HashSet<>();
        Comparator<String> caseInsensitiveComp =
                Comparator.comparing(String::toUpperCase);
        TreeSet<String> treeSet = new TreeSet<>(caseInsensitiveComp);
        treeSet.add("abc");
        treeSet.add("Abc");
        System.out.println(treeSet);

    }
}
