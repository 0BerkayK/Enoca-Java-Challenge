package enoca.cardApplication.controllers;

import enoca.cardApplication.models.entities.Order;
import enoca.cardApplication.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/orders")
public class OrdersControllers {
    @Autowired
    private OrderService orderService;

    @GetMapping("/{orderId}")
    public ResponseEntity<Order> getOrderById(@PathVariable Long orderId) {
        Order order = orderService.getOrderById(orderId);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }

    @GetMapping("/customer/{customerId}")
    public ResponseEntity<List<Order>> getAllOrdersForCustomer(@PathVariable Long customerId) {
        List<Order> orders = orderService.getAllOrdersForCustomer(customerId);
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    @PostMapping("/customer/{customerId}/cart/{cartId}")
    public ResponseEntity<Order> placeOrder(@PathVariable Long customerId, @PathVariable Long cartId) {
        Order order = orderService.placeOrder(customerId, cartId);
        return new ResponseEntity<>(order, HttpStatus.CREATED);
    }

    @GetMapping("/code/{orderCode}")
    public ResponseEntity<Order> getOrderForCode(@PathVariable String orderCode) {
        Order order = orderService.getOrderForCode(orderCode);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }

}
