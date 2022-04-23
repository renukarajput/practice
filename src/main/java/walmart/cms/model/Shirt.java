package walmart.cms.model;

import java.math.BigDecimal;

public class Shirt extends Clothing {

    public Shirt(String name, BigDecimal price, String id,ProductAttributes attributes) {
        super(name, price, id, attributes);
    }
}
