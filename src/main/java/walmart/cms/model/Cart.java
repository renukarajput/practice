package walmart.cms.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cart{
    private final List<Product> productList;
    private Status status;

    private final long createdAt;
    private long updatedAt;

    public Cart() {
        this.productList = new ArrayList<>();
        this.status = Status.ACTIVE;
        this.createdAt = System.currentTimeMillis();
    }

    public List<Product> getProductList() {
        return productList;
    }

    public BigDecimal getTotalPrice(){
        return this.productList.stream().map(p ->p.getPrice()).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public void add(Product p){
        productList.add(p);
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "productList=" + productList +
                ", status=" + status +
                '}';
    }
}
