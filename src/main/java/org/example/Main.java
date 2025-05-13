package org.example;

import org.example.entity.Author;
import org.example.entity.Price;
import org.example.model.BookDto;
import org.example.service.BookService;

import java.math.BigDecimal;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookDto dto = new BookDto();
        dto.setName("Harry Potter-1");
        dto.setIsbn("9781408855652");

        Author author = new Author();
        author.setFirstName("Jacklyn");
        author.setLastName("Hill");
        dto.setAuthors(List.of(author));

        Price price = new Price();
        price.setPrice(BigDecimal.valueOf(100.00));
        price.setVat(BigDecimal.valueOf(5.00));
        price.setDiscount(2L);
        dto.setPrice(price);

        BookService bookService = new BookService();
        bookService.create(dto);
    }
}