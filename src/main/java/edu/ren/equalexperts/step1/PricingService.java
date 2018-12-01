package edu.ren.equalexperts.step1;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class PricingService {
    private final ShoppingCart shoppingCart;

    public PricingService(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public BigDecimal getTotal() {
        BigDecimal sum = BigDecimal.valueOf(0);

        for (Product p : shoppingCart.getProductList()) {
            sum = sum.add(BigDecimal.valueOf(p.getPrice()));
        }

        return sum.round(new MathContext(5, RoundingMode.HALF_EVEN));
    }

    public BigDecimal getSalesTaxAmount() {

        BigDecimal salesTaxAmount = BigDecimal.valueOf(0);
        BigDecimal taxRate = BigDecimal.valueOf(0.125);

        for (Product p : shoppingCart.getProductList()) {
            salesTaxAmount = salesTaxAmount.add(BigDecimal.valueOf(p.getPrice()));
        }
        return salesTaxAmount.multiply(taxRate);
    }
}