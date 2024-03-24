package enoca.cardApplication.repositories;

import enoca.cardApplication.models.entities.Cart;
import enoca.cardApplication.models.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    Order findByOrderCode(String orderCode);

    List<Order> findAllByCustomerId(Long customerId);
}
