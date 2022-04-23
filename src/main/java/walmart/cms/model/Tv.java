package walmart.cms.model;

import java.math.BigDecimal;

public class Tv extends Electronics {

    public Tv(String name, BigDecimal price, String id, ProductAttributes attributes) {
        super(name, price,id, attributes);
    }
}
