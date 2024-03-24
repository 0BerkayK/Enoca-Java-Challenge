package enoca.cardApplication.services;

import enoca.cardApplication.models.entities.Order;

import java.util.List;

public interface OrderService {
    Order getOrderById(Long orderId);

    List<Order> getAllOrdersForCustomer(Long customerId);

    Order placeOrder(Long customerId, Long cartId);

    Order getOrderForCode(String orderCode);
}
