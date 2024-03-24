package enoca.cardApplication.controllers;

import enoca.cardApplication.models.entities.Cart;
import enoca.cardApplication.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/carts")
public class CartsController {

    @Autowired
    private CartService cartService;

    public CartsController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/{cartId}")
    public ResponseEntity<Cart> getCartById(@PathVariable Long cartId) {
        Cart cart = cartService.getCartById(cartId);
        return new ResponseEntity<>(cart, HttpStatus.OK);
    }

    @PostMapping("/customer/{customerId}")
    public ResponseEntity<Cart> createCartForCustomer(@PathVariable Long customerId) {
        Cart cart = cartService.createCartForCustomer(customerId);
        return new ResponseEntity<>(cart, HttpStatus.CREATED);
    }

    @PutMapping("/{cartId}")
    public ResponseEntity<Cart> updateCart(@PathVariable Long cartId, @RequestBody Cart cart) {
        Cart updatedCart = cartService.updateCart(cartId, cart);
        return new ResponseEntity<>(updatedCart, HttpStatus.OK);
    }

    @DeleteMapping("/{cartId}")
    public ResponseEntity<Void> deleteCart(@PathVariable Long cartId) {
        cartService.deleteCart(cartId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
