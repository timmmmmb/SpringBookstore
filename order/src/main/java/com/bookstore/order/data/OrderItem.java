package com.bookstore.order.data;

import java.awt.print.Book;

public class OrderItem {

    private Long id;
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
