package enoca.cardApplication.services;

import enoca.cardApplication.models.entities.Cart;

public interface CartService {
    Cart getCartById(Long cartId);

    Cart createCartForCustomer(Long customerId);

    Cart updateCart(Long cartId, Cart cart);

    void deleteCart(Long cartId);
}
