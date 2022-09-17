package by.senla.rest.senlarest.repo;

import by.senla.rest.senlarest.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
