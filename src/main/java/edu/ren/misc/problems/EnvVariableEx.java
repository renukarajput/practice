package edu.ren.misc.problems;

import java.io.IOException;
import java.util.Map;

public class EnvVariableEx {

    public static void main(String[] args) throws IOException {
        String key = "mykey";
        String value = "value123456";
        ProcessBuilder pb = new ProcessBuilder("/bin/bash", "-c", "echo $mykey>/Users/renuka/tmp"); // or any other program you want to run

        Map<String, String> envMap = pb.environment();

        envMap.put(key, value);
        System.out.println(key + " ==> " + envMap.get(key));
        pb.start();
        System.out.println("*** " + System.getenv(key));

    }
}
