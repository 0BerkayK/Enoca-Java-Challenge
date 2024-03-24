package enoca.cardApplication.repositories;

import enoca.cardApplication.models.entities.Cart;
import enoca.cardApplication.models.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {


    Cart save(Cart cart);


    void deleteById(Long id);
}
