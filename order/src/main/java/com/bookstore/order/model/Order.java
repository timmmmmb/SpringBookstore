package com.bookstore.order.model;

import com.bookstore.customer.model.Address;
import com.bookstore.customer.model.CreditCard;
import com.bookstore.customer.model.Customer;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
public class Order {

    @Id
    @GeneratedValue
    private Long id;
    private Date date;
    private BigDecimal amount;
    private OrderStatus status;

    @OneToOne(fetch = FetchType.LAZY)
    private Customer customer;
    @Embedded
    private Address address;
    @Embedded
    private CreditCard creditCard;

    @OneToMany(fetch = FetchType.LAZY)
    private List<OrderItem> items;

    public Order() {
    }

    public Order(Date date, BigDecimal amount, OrderStatus status, Customer customer, List<OrderItem> items) {
        this.date = date;
        this.amount = amount;
        this.status = status;
        this.customer = customer;
        this.items = items;
    }

    public Long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }
}
