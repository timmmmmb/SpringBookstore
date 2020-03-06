package com.bookstore.order.data;

import java.math.BigDecimal;

public class BookInfo {

	private String isbn;
	private String title;
	private String authors;
	private BigDecimal price;

	public BookInfo() {
	}

	public BookInfo(String isbn, String title, String authors, BigDecimal price) {
		this.isbn = isbn;
		this.title = title;
		this.authors = authors;
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthors() {
		return authors;
	}

	public BigDecimal getPrice() {
		return price;
	}
}
