package com.bookstore.order.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class OrderItem {

    @Id
    @GeneratedValue
    private Long id;
    @Embedded
    private BookInfo book;
    private Integer quantity;

    public OrderItem() {
    }

    public OrderItem(BookInfo book, Integer quantity) {
        this.book = book;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public BookInfo getBook() {
        return book;
    }

    public void setBook(BookInfo book) {
        this.book = book;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
