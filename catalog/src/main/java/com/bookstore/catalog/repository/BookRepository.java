package com.bookstore.catalog.repository;

import com.bookstore.catalog.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookRepository extends JpaRepository<Book, Integer> {
    @Query("SELECT b FROM Book b WHERE b.isbn = :isbn")
    Book findByISBN(String isbn);
    @Query("SELECT b FROM Book b WHERE b.title LIKE CONCAT('%', :title, '%')")
    Book findByTitle(String title);
}
