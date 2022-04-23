package walmart.cms.service;

import walmart.cms.dto.CartCategoryCount;
import walmart.cms.model.Cart;
import walmart.cms.model.ProductCategory;
import walmart.cms.model.Status;
import walmart.cms.repo.CartRepository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CartService {

    private List<Cart> cart;
    private final CartRepository repo;

    public CartService(CartRepository repo) {
        this.repo = repo;
    }

    public Cart newEmptyCart(){
        final Cart cart = new Cart();
        repo.save(cart);
        return cart;
    }
    public void update(Cart cart){
        repo.save(cart);
    }

    public void discard(Cart cart){
        moveStatus(cart, Status.DISCARDED);
    }

    public void checkout(Cart cart){
        moveStatus(cart, Status.ORDERED);
    }

    private void moveStatus(Cart cart, Status ordered) {
        repo.delete(cart);
        cart.setStatus(ordered);
        repo.save(cart);
    }

    public CartCategoryCount findCartByProductCategory(ProductCategory category, Status status) {

        return null;
    }
    public List<Cart> findCartByStatus(Status status){
        return repo.findByStatus(status).stream().collect(Collectors.toList());
    }

    public List<Cart> findCartBySortedHighestValue(Status status, Comparator<Cart> cartComparator){
        return repo.findByStatus(status).stream().sorted(cartComparator).collect(Collectors.toList());
    }

    public List<Cart> findCartForGivenDateRange(Status status, long startDate, long endDate) {
        return repo.findByDateRange(status, startDate, endDate).stream().collect(Collectors.toList());
    }
}


