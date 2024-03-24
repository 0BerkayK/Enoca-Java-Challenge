package enoca.cardApplication.services.impl;
import enoca.cardApplication.models.entities.Order;
import enoca.cardApplication.repositories.OrderRepository;
import enoca.cardApplication.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order getOrderById(Long orderId) {
        Optional<Order> orderOptional = orderRepository.findById(orderId);
        return orderOptional.orElse(null);
    }

    @Override
    public List<Order> getAllOrdersForCustomer(Long customerId) {
        return orderRepository.findAllByCustomerId(customerId);
    }

    @Override
    public Order placeOrder(Long customerId, Long cartId) {

        return null;
    }

    @Override
    public Order getOrderForCode(String orderCode) {
        return orderRepository.findByOrderCode(orderCode);
    }
}