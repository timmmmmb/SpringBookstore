package com.bookstore.order.model;

import com.bookstore.customer.model.Address;
import com.bookstore.customer.model.CreditCard;
import com.bookstore.customer.model.Customer;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface OrderInfo {
    public Date getDate();

    public BigDecimal getAmount();

    public OrderStatus getStatus();

    public Customer getCustomer();

    public Address getAddress();

    public CreditCard getCreditCard();

    public List<OrderItem> getItems();
}
