package walmart.cms.repo;

import walmart.cms.model.Cart;
import walmart.cms.model.ProductCategory;
import walmart.cms.model.Status;

import java.util.*;
import java.util.stream.Collectors;

public class CartRepository {

    Map<Status, Set<Cart>> statusListMap;
    Map<Status,Integer> statusCounts;

    public CartRepository() {
        this.statusListMap = new HashMap<>();
    }

    public Set<Cart> findByStatus(Status status) {
        return statusListMap.getOrDefault(status, Collections.EMPTY_SET);
    }

    public Set<Cart> findByDateRange(Status status, long startDate, long endDate) {
        return findByStatus(status).stream().filter(o ->
                o.getCreatedAt() >= startDate && (o.getUpdatedAt() <= endDate)).collect(Collectors.toSet());
    }

    public void save(Cart cart) {
        statusListMap.putIfAbsent(cart.getStatus(), new HashSet<>());
        statusListMap.get(cart.getStatus()).add(cart);
    }

    public void delete(Cart cart) {
        statusListMap.get(cart.getStatus()).remove(cart);
    }

    ///Cart 1 --{shirt tv     Cart 2 --{shirt tv
    public Map<Status, Integer> findCartByProductCategory(ProductCategory category, Status status) {
        Map<Status, Integer> cartCountMap = new HashMap<>();
        Arrays.stream(Status.values()).forEach(s -> {
            final Set<Cart> carts = statusListMap.get(s);
            carts.forEach(cart -> {
                if (cart.getProductList().stream().map(p -> p.getCategory()).anyMatch(c -> c.equals(category))) {
                    final Integer oldCount = cartCountMap.getOrDefault(cart.getStatus(), 0);
                    cartCountMap.put(cart.getStatus(), oldCount + 1);
                }
            });
        });
        return cartCountMap;
    }
}
//0, 1, 0, 3, 12 write=0

//12     3 0       0


