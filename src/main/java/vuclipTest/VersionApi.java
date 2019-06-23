package vuclipTest;

import java.io.*;
import java.util.*;

public class VersionApi {
    public static void main(String[] args) {
        int numLines = 0;
        try {
            Scanner in = new Scanner(new BufferedReader(new FileReader("/Users/renuka/oss/practice/src/main/java/vuclipTest/input.txt")));
            appWithOlderVersion(in);
//            Map<String, String> apiVersionMap = apiWithLatestVersion(in);
//            Scanner input = new Scanner(new BufferedReader(new FileReader("/Users/renuka/oss/practice/src/main/java/vuclipTest/input.txt")));
//            Set<String> setOfApps = getAppWithOlderVersion(input, apiVersionMap);
//            System.out.println(setOfApps);

            /* In this example, we're writing `num_lines` to
               the file `output.txt`.
               You should modify this part of the
               program to write the desired output */
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
            output.println("" + numLines);
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
    }

    private static Set<String> getAppWithOlderVersion(Scanner in, Map<String, String> apiVersionMap) {
        //Mail App, Authentication API, v6
        Set<String> set = new TreeSet<>();
        while (in.hasNextLine()) {
            String line = in.nextLine();
            if (!line.isEmpty()) {
                String[] split = line.split(",");
                String app = split[0];
                String api = split[1];
                String currentVersion = split[2];
                if (apiVersionMap.containsKey(api)) {
                    String latestVersion = apiVersionMap.get(api);
                    if (currentVersion.compareTo(latestVersion) < 0) {
                        set.add(app);
                    }
                }
            }
        }
        return set;
    }

    public static Map<String, String> apiWithLatestVersion(Scanner in) {
        Map<String, String> apiWithVersion = new HashMap();
        while (in.hasNextLine()) {
            String line = in.nextLine();
            if (!line.isEmpty()) {
                String[] split = line.split(",");
                String api = split[1];
                String version = split[2];
                apiWithVersion.putIfAbsent(api, version);
                if (apiWithVersion.containsKey(api)) {
                    if (version.compareTo(apiWithVersion.get(api)) > 0)
                        apiWithVersion.put(api, version);
                }

            }
        }
        return apiWithVersion;
    }

//Mail App, Authentication API, v6
    public static void appWithOlderVersion(Scanner in) {
        while (in.hasNextLine()) {
            String line = in.nextLine();
            if (!line.isEmpty()) {
                String[] split = line.split(",");
                String app = split[0];
                String api = split[1];
                String currentVersion = split[2];

            }
        }
    }

}
