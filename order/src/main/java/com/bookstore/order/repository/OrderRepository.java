package com.bookstore.order.repository;

import com.bookstore.customer.model.Customer;
import com.bookstore.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    @Query("SELECT o FROM Order o WHERE o.customer = :customer")
    List<Order> findLastOrders(Customer customer);
}
