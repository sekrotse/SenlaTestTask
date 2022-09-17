package by.senla.rest.senlarest.service;

import by.senla.rest.senlarest.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface ProductService {
    List<Product> findAll();

    Optional<Product> findById(Integer id);

    void save(Product product);

    void delete(Product product);
}
