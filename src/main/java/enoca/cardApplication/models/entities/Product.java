package enoca.cardApplication.models.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product extends BaseEntity {
    private String name;
    private double price;
    private int stockQuantity;
}