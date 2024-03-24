package enoca.cardApplication.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class CartItem extends BaseEntity {
    @ManyToOne
    private Cart cart;
    @ManyToOne
    private Product product;
    private int quantity;
    private double price;
}