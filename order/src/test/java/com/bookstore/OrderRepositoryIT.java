package com.bookstore;

import com.bookstore.customer.model.Address;
import com.bookstore.customer.model.CreditCard;
import com.bookstore.customer.model.CreditCardType;
import com.bookstore.customer.model.Customer;
import com.bookstore.customer.repository.CustomerRepository;
import com.bookstore.order.model.BookInfo;
import com.bookstore.order.model.Order;
import com.bookstore.order.model.OrderItem;
import com.bookstore.order.model.OrderStatus;
import com.bookstore.order.repository.OrderRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class OrderRepositoryIT {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Test
    @Transactional
    public void test() {
        Address address = new Address("Street", "Bern", "Bern", "3000", "Switzerland");
        CreditCard creditCard = new CreditCard(CreditCardType.MASTERCARD, "12345678", 10, 2020);

        Customer customer = new Customer();
        customer.setLastName("Frey");
        customer.setFirstName("Tim");
        customer.setEmail("mail@outlook.com");
        customer.setPassword("12345");
        customer.setAddress(address);
        customer.setCreditCard(creditCard);

        customer = customerRepository.saveAndFlush(customer);
        assertNotNull(customer.getId());

        customer = customerRepository.findById(customer.getId()).get();
        assertNotNull(customer);
        assertEquals(address, customer.getAddress());
        assertEquals(creditCard, customer.getCreditCard());

        OrderItem orderItem = new OrderItem();
        orderItem.setBook(new BookInfo());
        orderItem.setQuantity(1);

        Order order = new Order();
        order.setAddress(address);
        order.setCreditCard(creditCard);
        order.setCustomer(customer);
        order.setAmount(new BigDecimal(100));
        order.setDate(new Date());
        order.setStatus(OrderStatus.PROCESSING);
        List<OrderItem> items = new ArrayList<>();
        items.add(orderItem);
        order.setItems(items);

        order = orderRepository.saveAndFlush(order);
        assertNotNull(order.getId());

        order = orderRepository.findById(order.getId()).get();
        assertNotNull(order);
    }
}
