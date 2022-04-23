package walmart.cms.service;

import walmart.cms.model.Cart;

import java.util.Comparator;

public class CartComparator implements Comparator<Cart> {

    @Override
    public int compare(Cart o1, Cart o2) {
        final int result = Integer.compare(o1.getProductList().size(), o2.getProductList().size());
        return result == 0 ? o1.getTotalPrice().compareTo(o2.getTotalPrice()) : result;
    }
}
