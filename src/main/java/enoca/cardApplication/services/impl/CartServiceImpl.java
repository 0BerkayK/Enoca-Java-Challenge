package enoca.cardApplication.services.impl;

import enoca.cardApplication.models.entities.Cart;
import enoca.cardApplication.models.entities.Customer;
import enoca.cardApplication.repositories.CartRepository;
import enoca.cardApplication.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartRepository cartRepository;
    private Customer customer;

    @Override
    public Cart getCartById(Long cartId) {
        return cartRepository.findById(cartId).orElse(null);
    }

    @Override
    public Cart createCartForCustomer(Long customerId) {

        Cart cart = new Cart();
        cart.setCustomer(customer);
        return cartRepository.save(cart);
    }

    @Override
    public Cart updateCart(Long cartId, Cart cart) {

        return cartRepository.save(cart);
    }

    @Override
    public void deleteCart(Long cartId) {

        cartRepository.deleteById(cartId);
    }
}
