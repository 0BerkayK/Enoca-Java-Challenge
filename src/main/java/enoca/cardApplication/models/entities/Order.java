package enoca.cardApplication.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class Order extends BaseEntity {
    @ManyToOne
    private Customer customer;
    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY)
    private Set<OrderItem> items = new HashSet<>();
    private double totalPrice;

    public void calculateAndUpdateTotalPrice() {
        double price = 0;
        while(items.stream().iterator().hasNext()) {
            OrderItem item = items.iterator().next();
            price = price + (item.getPriceAtOrder() * item.getQuantity());
        }
        setTotalPrice(price);
    }
}
