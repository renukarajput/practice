package ideas;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Driver {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter input : ");
        ArrayList<String> inputData = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()) {
            final String line = in.nextLine();
            if (line.isEmpty()) {
                break;
            }
            inputData.add(line);
        }
        List<String> retVal = processData(inputData);
        PrintWriter output = new PrintWriter(System.out);
        for(String str: retVal)
            output.println(str);
        output.close();
    }

    public static List<String> processData(ArrayList<String> array) {
        final APIUsage apiUsage = new APIUsage();
        final CustomerAPIUsage customerAPIUsage = new CustomerAPIUsage();
        final List<Usage> usageList = Arrays.asList(apiUsage, customerAPIUsage);
        array.forEach(line -> {
            final APIRecord apiRecord = InputParser.parse(line);
            usageList.forEach(x -> x.process(apiRecord));
        });
        return customerAPIUsage.getCustomersWithDeprecatedVersion(apiUsage);
    }
}

class APIRecord {
    String apiName;
    String customerName;
    int version;

    public APIRecord(String apiName, String customerName, int version) {
        this.apiName = apiName;
        this.customerName = customerName;
        this.version = version;
    }
}

class InputParser {
    static APIRecord parse(String line) {
        final String[] splits = line.split(",");
        final String[] level = splits[3].split(" ");
        final String customerName = splits[0];
        final String apiName = splits[2];
        final Integer version = Integer.valueOf(level[level.length - 1]);
        return new APIRecord(apiName, customerName, version);
    }
}

interface Usage {
    void process(APIRecord record);
}

class APIUsage implements Usage {
    private final Map<String, Integer> apiMostDeprecatedVersions = new HashMap<>();
    private final Map<String, Integer> apiHighestVersions = new HashMap<>();

    @Override
    public void process(APIRecord record) {
        final String apiName = record.apiName;
        final int version = record.version;
        if (apiHighestVersions.getOrDefault(apiName, Integer.MIN_VALUE) < version) {
            Integer oldVersion = apiHighestVersions.put(apiName, version);
            if (oldVersion != null && apiMostDeprecatedVersions.getOrDefault(apiName, Integer.MAX_VALUE) > oldVersion) {
                apiMostDeprecatedVersions.put(apiName, oldVersion);
            }
        }
        if (apiHighestVersions.get(apiName) > version &&
                apiMostDeprecatedVersions.getOrDefault(apiName, Integer.MAX_VALUE) > version) {
            apiMostDeprecatedVersions.put(apiName, version);
        }
    }

    boolean isMostDeprecatedVersion(String apiName, int version) {
        return apiMostDeprecatedVersions.containsKey(apiName) && apiMostDeprecatedVersions.get(apiName) == version;
    }
}

class CustomerAPIUsage implements Usage {
    private final Map<String, Map<String, Integer>> customerLowestApiVersion = new HashMap<>();

    @Override
    public void process(APIRecord record) {
        final String customerName = record.customerName;
        final String apiName = record.apiName;

        customerLowestApiVersion.putIfAbsent(customerName, new HashMap<>());

        final Map<String, Integer> apiVersionMap = customerLowestApiVersion.get(customerName);
        Integer existingApiVersion = apiVersionMap.getOrDefault(apiName, Integer.MAX_VALUE);

        customerLowestApiVersion.get(customerName).put(apiName, Integer.min(existingApiVersion, record.version));
    }

    List<String> getCustomersWithDeprecatedVersion(APIUsage usage) {
        Set<String> customers = new HashSet<>();
        Iterator<Map.Entry<String, Map<String, Integer>>> iterator = customerLowestApiVersion.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Map<String, Integer>> next = iterator.next();
            String customerName = next.getKey();
            final Map<String, Integer> customerApiVersionMap = next.getValue();
            customerApiVersionMap.forEach((api, version) -> {
                if (usage.isMostDeprecatedVersion(api, version)) {
                    customers.add(customerName);
                }
            });
        }
        return new ArrayList<>(customers);
    }
}
