package enoca.cardApplication.services;

import enoca.cardApplication.models.entities.Product;
import enoca.cardApplication.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface ProductService {



    List<Product> getAllProducts();

    Product getProductById(Long productId);

    Product createProduct(Product product);

    Product updateProduct(Long productId, Product product);

    void deleteProduct(Long productId);

    Product GetProduct(Long id);

    Product CreateProduct(Product product);

    Product UpdateProduct(Long id, Product product);

    void DeleteProduct(Long id);
}
