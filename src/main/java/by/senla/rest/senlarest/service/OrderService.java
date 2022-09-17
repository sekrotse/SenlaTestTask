package by.senla.rest.senlarest.service;

import by.senla.rest.senlarest.entity.Order;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface OrderService {
    List<Order> findAll();

    Optional<Order> findById(Integer id);

    void save(Order order);

    void delete(Order order);
}
