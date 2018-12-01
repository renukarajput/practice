package edu.ren.equalexperts;

import edu.ren.equalexperts.step1.Product;
import edu.ren.equalexperts.step1.ShoppingCart;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ShoppingCartTest {
    ShoppingCart shoppingCart = new ShoppingCart();

    // step-1
    @Test
    public void addOneProductToCart() {
        Product product = new Product(11, 39.99, "Dove");
        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getProductList().size(), is(1));
        assertThat(shoppingCart.getTotal(), is(39.99));
    }

    //step-1
    @Test
    public void addFiveProductsToCart() {
        Product productOne = new Product(11, 39.99, "Dove");
        Product productTwo = new Product(11, 39.99, "Dove");
        Product productThree = new Product(11, 39.99, "Dove");
        Product productFour = new Product(11, 39.99, "Dove");
        Product productFive = new Product(11, 39.99, "Dove");

        shoppingCart.addProduct(productOne);
        shoppingCart.addProduct(productTwo);
        shoppingCart.addProduct(productThree);
        shoppingCart.addProduct(productFour);
        shoppingCart.addProduct(productFive);

        assertThat(shoppingCart.getProductList().size(), is(5));
        assertThat(shoppingCart.getTotal(), is(199.95));
    }

    // step-2
    @Test
    public void addMoreProductsToCart() {
        Product productOne = new Product(11, 39.99, "Dove");
        Product productTwo = new Product(11, 39.99, "Dove");
        Product productThree = new Product(11, 39.99, "Dove");
        Product productFour = new Product(11, 39.99, "Dove");
        Product productFive = new Product(11, 39.99, "Dove");

        shoppingCart.addProduct(productOne);
        shoppingCart.addProduct(productTwo);
        shoppingCart.addProduct(productThree);
        shoppingCart.addProduct(productFour);
        shoppingCart.addProduct(productFive);

        assertThat(shoppingCart.getProductList().size(), is(5));
        assertThat(shoppingCart.getTotal(), is(199.95));

        Product p6 = new Product(11, 39.99, "Dove");
        Product p7 = new Product(11, 39.99, "Dove");
        Product p8 = new Product(11, 39.99, "Dove");
        shoppingCart.addProduct(p6);
        shoppingCart.addProduct(p7);
        shoppingCart.addProduct(p8);

        assertThat(shoppingCart.getProductList().size(), is(8));
        assertThat(shoppingCart.getTotal(), is(319.92));
    }

    // step-3
    @Test
    public void taxRateWithMultipleItems() {
        Product productOne = new Product(11, 39.99, "Dove");
        Product productTwo = new Product(11, 39.99, "Dove");

        Product productThree = new Product(22, 99.99, "AxeDeo");
        Product productFour = new Product(22, 99.99, "AxeDeo");

        shoppingCart.addProduct(productOne);
        shoppingCart.addProduct(productTwo);
        shoppingCart.addProduct(productThree);
        shoppingCart.addProduct(productFour);

        double totalAmount = shoppingCart.getSalesTaxAmount();
        assertThat(totalAmount, is(314.96));

    }

    @Test
    public void test() {
        BigDecimal sum1 = BigDecimal.valueOf(0.567);
        BigDecimal sum2 = BigDecimal.valueOf(0.564);
        BigDecimal sum3 = BigDecimal.valueOf(0.5889);

        double val1 = sum1.round(new MathContext(2, RoundingMode.HALF_EVEN)).doubleValue();
        double val2 = sum2.round(new MathContext(2, RoundingMode.HALF_EVEN)).doubleValue();
        double val3 = sum3.round(new MathContext(2, RoundingMode.HALF_EVEN)).doubleValue();

        assertThat(val1, is(0.57));
        assertThat(val2, is(0.56));
        assertThat(val3, is(0.59));
    }

}