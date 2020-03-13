package com.bookstore.catalog.repository;

import com.bookstore.catalog.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookRepository extends JpaRepository<Book, Integer> {
    @Query("select b from Book b where b.isbn = :isbn")
    Book findByISBN(String isbn);

}
