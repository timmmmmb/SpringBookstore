package org.bookstore.catalog.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.math.BigDecimal;

@Data
@Entity
public class Book {
    @Id  @GeneratedValue
    private Integer id;
    private String title;
    private String isbn;
    private String subtitle;
    private String authors;
    private BigDecimal price;
    private String publisher;
    private Integer publicationYear;
    private int numberOfPages;
    private String description;
    private String imageUrl;
    private int rating;


}
