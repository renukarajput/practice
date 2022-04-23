package walmart.cms.model;

import java.math.BigDecimal;

public class Electronics extends Product {
    public Electronics(String name, BigDecimal price, String id, ProductAttributes attributes) {
        super(name, price, id, attributes);
    }

    public ProductCategory getCategory() {
        return ProductCategory.Electronics;
    }
}


