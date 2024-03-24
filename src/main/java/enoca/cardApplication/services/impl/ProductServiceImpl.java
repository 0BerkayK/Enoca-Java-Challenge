package enoca.cardApplication.services.impl;

import enoca.cardApplication.repositories.ProductRepository;
import enoca.cardApplication.services.ProductService;
import enoca.cardApplication.models.entities.Product;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product getProductById(Long productId) {
        return null;
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public Product updateProduct(Long productId, Product product) {
        return null;
    }

    @Override
    public void deleteProduct(Long productId) {

    }

    @Override
    public Product GetProduct(Long id) {
        return null;
    }

    @Override
    public Product CreateProduct(Product product) {
        return null;
    }

    @Override
    public Product UpdateProduct(Long id, Product product) {
        return null;
    }

    @Override
    public void DeleteProduct(Long id) {

    }
}
