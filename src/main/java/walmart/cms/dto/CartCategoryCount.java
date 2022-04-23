package walmart.cms.dto;

import walmart.cms.model.Status;

import java.util.Map;

public class CartCategoryCount {
    private Map<Status,Integer> result;

    public Map<Status, Integer> getResult() {
        return result;
    }
}
