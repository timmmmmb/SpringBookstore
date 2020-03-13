package com.bookstore.catalog.repository;

import com.bookstore.catalog.model.Book;
import org.junit.jupiter.api.BeforeEach;
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

    private String isbn = "1617294942";
    private String title = "Java is cool";

    @BeforeEach
    @Transactional
    public void initializeBookstore(){
        Book book = new Book();
        book.setTitle("Spring in Action");
        book.setIsbn(isbn);
        book.setAuthors("Craig Walls");
        book.setPrice(new BigDecimal("66.95"));
        repository.saveAndFlush(book);

        book = new Book();
        book.setTitle("Java is cool");
        book.setIsbn("1234567890");
        book.setAuthors("Craig Walls");
        book.setPrice(new BigDecimal("66.95"));
        repository.saveAndFlush(book);
    }

    @Test
    @Transactional
    public void findByISBN() {
        Book b = repository.findByISBN(isbn);
        assertEquals(isbn, b.getIsbn());
    }

    @Test
    @Transactional
    public void findByTitle() {
        Book b = repository.findByTitle("Java");
        assertEquals(title, b.getTitle());
    }
}
