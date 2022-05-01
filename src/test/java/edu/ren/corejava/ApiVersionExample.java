package edu.ren.corejava;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;

class Row{
    String app, api, version;

    public Row(String line) {
        String[] row=line.split(",");
        this.app = row[0];
        this.api = row[1];
        this.version = row[2];
    }

    public String getApp() {
        return app;
    }

    public String getApi() {
        return api;
    }

    public String getVersion() {
        return version;
    }
}
public class ApiVersionExample {
    public static void main(String[] args) {
        String[] lines={
                "app1,api1,v1",
                "app1,api2,v2",
                "app2,api1,v3",
                "app3,api2,v4",
                "app4,api3,v1",
                "app4,api2,v1"
        };
        Map<String, Optional<Row>> group = Arrays.stream(lines).map(Row::new).
                collect(groupingBy(Row::getApi,
                maxBy(Comparator.comparing(Row::getVersion))));

        System.out.println(group);
        Set<String> collected = Arrays.stream(lines).map(Row::new).filter(row ->
                row.version.compareTo(group.get(row.api).get().getVersion()) < 0)
                .map(row -> row.getApp()).collect(Collectors.toSet());
        System.out.println(collected);
    }
}
