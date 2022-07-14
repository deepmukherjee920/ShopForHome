package com.capstonegroupsix.api.service;

import com.capstonegroupsix.api.entity.ProductInOrder;
import com.capstonegroupsix.api.entity.User;


public interface ProductInOrderService {
    void update(String itemId, Integer quantity, User user);
    ProductInOrder findOne(String itemId, User user);
}
