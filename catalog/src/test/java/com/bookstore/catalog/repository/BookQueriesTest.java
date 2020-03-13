package com.bookstore.catalog.repository;

import com.bookstore.catalog.model.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BookQueriesTest {
    @Autowired
    private BookRepository repository;

    @Test
    @Transactional
    public void save() {
        String isbn = "1617294942";
        Book book = new Book();
        book.setTitle("Spring in Action");
        book.setIsbn(isbn);
        book.setAuthors("Craig Walls");
        book.setPrice(new BigDecimal("66.95"));
        book = repository.saveAndFlush(book);

        Book b = repository.findByISBN(isbn);
        assertEquals(book, b);
    }
}
