package com.capstonegroupsix.api.service;

import java.util.Collection;

import com.capstonegroupsix.api.entity.Cart;
import com.capstonegroupsix.api.entity.ProductInOrder;
import com.capstonegroupsix.api.entity.User;


public interface CartService {
    Cart getCart(User user);

    void mergeLocalCart(Collection<ProductInOrder> productInOrders, User user);

    void delete(String itemId, User user);

    void checkout(User user);
}
