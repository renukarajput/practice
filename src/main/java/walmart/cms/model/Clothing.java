package walmart.cms.model;

import java.math.BigDecimal;

public class Clothing extends Product {
    public Clothing(String name, BigDecimal price, String id, ProductAttributes attributes) {
        super(name, price, id, attributes);
    }

    public ProductCategory getCategory() {
        return ProductCategory.Clothing;
    }
}
