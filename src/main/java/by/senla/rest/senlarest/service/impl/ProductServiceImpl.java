package by.senla.rest.senlarest.service.impl;

import by.senla.rest.senlarest.entity.Product;
import by.senla.rest.senlarest.repo.ProductRepository;
import by.senla.rest.senlarest.service.ProductService;

import java.util.List;
import java.util.Optional;

public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public void delete(Product product) {

    }
}
