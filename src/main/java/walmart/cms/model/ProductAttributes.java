package walmart.cms.model;

import java.util.Map;

public class ProductAttributes {
    private Map<String, String> properties;
    private Map<String, Double> numeric;

    public ProductAttributes() {
    }

    public ProductAttributes(Map<String, String> properties, Map<String, Double> numeric) {
        this.properties = properties;
        this.numeric = numeric;
    }
}

