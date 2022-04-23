package walmart.cms.service;

import org.junit.Test;
import walmart.cms.model.*;
import walmart.cms.repo.CartRepository;

import java.math.BigDecimal;
import java.util.List;

public class CartServiceTest {
    final CartService cartService = new CartService(new CartRepository());

    @Test
    public void newEmptyCart() {
        ProductAttributes attributes = new ProductAttributes();
        final Cart cart = cartService.newEmptyCart();
        cart.add(new Tv("Sony", BigDecimal.valueOf(100.0), "123", attributes));
        cart.add(new Shirt("Levis", BigDecimal.valueOf(500.0), "111", attributes));
        cartService.update(cart);

        final Cart cart1 = cartService.newEmptyCart();
        cart1.add(new Tv("Onida", BigDecimal.valueOf(100.0), "123", attributes));
        cart1.add(new Shirt("Lee", BigDecimal.valueOf(5.0), "111", attributes));
        cart1.add(new Shirt("Jio", BigDecimal.valueOf(50.0), "111", attributes));
        cartService.update(cart1);

        final List<Cart> carts = cartService.findCartBySortedHighestValue(Status.ACTIVE, new CartComparator().reversed());
        System.out.println(carts);
        System.out.println(carts.size());
    }

    @Test
    public void findCartByStatus() {
        ProductAttributes attributes = new ProductAttributes();
        final Cart cart = cartService.newEmptyCart();
        cart.add(new Tv("Sony", BigDecimal.valueOf(100.0), "123", attributes));
        cart.add(new Shirt("Levis", BigDecimal.valueOf(500.0), "111", attributes));
        cartService.update(cart);
        final List<Cart> cartByStatus = cartService.findCartByStatus(Status.DISCARDED);
        System.out.println(cartByStatus);
    }

    @Test
    public void findCartByGivenStatus() {
        ProductAttributes attributes = new ProductAttributes();
        final Cart cart = cartService.newEmptyCart();
        cart.add(new Tv("Sony", BigDecimal.valueOf(100.0), "123", attributes));
        cart.add(new Shirt("Levis", BigDecimal.valueOf(500.0), "111", attributes));
        cartService.update(cart);

        final List<Cart> cartByStatus = cartService.findCartByStatus(Status.ACTIVE);
        System.out.println(cartByStatus);
        cartService.checkout(cart);
        final List<Cart> checkoutCart = cartService.findCartByStatus(Status.ORDERED);
        System.out.println(checkoutCart);

        cartService.discard(cart);
        final List<Cart> discardedCart = cartService.findCartByStatus(Status.DISCARDED);
        System.out.println(discardedCart);
    }
}