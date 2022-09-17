package by.senla.rest.senlarest.service;

import by.senla.rest.senlarest.entity.Order;
import by.senla.rest.senlarest.entity.OrderItem;

import java.util.List;
import java.util.Optional;

public interface OrderItemService {
    List<OrderItem> findAll();

    Optional<OrderItem> findById(Integer id);

    void save(OrderItem orderItem);

    void delete(OrderItem orderItem);
}
