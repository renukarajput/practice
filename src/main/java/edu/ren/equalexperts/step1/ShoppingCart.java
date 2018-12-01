package edu.ren.equalexperts.step1;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> productList;

    private final PricingService pricingService = new PricingService(this);

    public ShoppingCart() {
        this.productList = new ArrayList<>();
    }

    public List<Product> getProductList() {
        return productList;
    }

    public boolean addProduct(Product product) {
        productList.add(product);
        return true;
    }

    public double getTotal() {
        return pricingService.getTotal().doubleValue();
    }

    public double getSalesTaxAmount() {
        return pricingService.getTotal().add(pricingService.getSalesTaxAmount()).doubleValue();
    }

}
