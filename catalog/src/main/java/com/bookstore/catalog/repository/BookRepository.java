package com.bookstore.catalog.repository;

import com.bookstore.catalog.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
