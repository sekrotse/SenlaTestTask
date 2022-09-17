package by.senla.rest.senlarest.repo;

import by.senla.rest.senlarest.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {
    @Query("select ord.quantity from OrderItem ord where ord.product.id = :id")
    int getQuantityByProductId(@Param("id") Integer productId);
}
