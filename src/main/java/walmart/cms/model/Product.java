package walmart.cms.model;

import java.math.BigDecimal;

public abstract class Product {
    private final String name;
    private final String id;
    private final BigDecimal price;
    private final ProductAttributes attributes;

    public Product(String name, BigDecimal price, String id, ProductAttributes attributes) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.attributes = attributes;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public abstract ProductCategory getCategory();

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", price=" + price +
                ", attributes=" + attributes +
                '}';
    }
}
