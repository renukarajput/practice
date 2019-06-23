package vuclip;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;

public class AppVersionService {

    public Set<String> getOlderApiVersionApps(Supplier<Stream<ApiVersionEntity>> streamSupplier) {

        Map<String, Optional<ApiVersionEntity>> latestVersionApiMap = getLatestVersionApiMap(streamSupplier.get());

        return streamSupplier.get().filter(row ->
                row.getVersion().compareTo(latestVersionApiMap.get(row.getApi()).get().getVersion()) < 0)
                .map(row -> row.getApp()).collect(Collectors.toCollection(() -> new TreeSet<>()));

    }

    private Map<String, Optional<ApiVersionEntity>> getLatestVersionApiMap(Stream<ApiVersionEntity> apiStream) {
        return apiStream.
                collect(groupingBy(ApiVersionEntity::getApi,
                        maxBy(Comparator.comparing(ApiVersionEntity::getVersion))));
    }
}