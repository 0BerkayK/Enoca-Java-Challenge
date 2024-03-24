package enoca.cardApplication.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class Cart extends BaseEntity {
    @OneToOne
    private Customer customer;
    @OneToMany(mappedBy = "cart", fetch = FetchType.LAZY)
    private Set<CartItem> items = new HashSet<>();
    private double totalPrice;

    public void calculateAndUpdateTotalPrice() {
        double price = 0;
        while(items.stream().iterator().hasNext()) {
            CartItem item = items.iterator().next();
            price = price + (item.getPrice() * item.getQuantity());
        }
        setTotalPrice(price);
    }
}