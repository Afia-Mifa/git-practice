package org.example;

import org.example.entity.Author;
import org.example.model.BookDto;
import org.example.service.BookService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookDto dto = new BookDto();
        dto.setName("Harry Potter");
        dto.setIsbn("9781408855652");
        Author author = new Author();
        author.setFirstName("Jacklyn");
        author.setLastName("Hill");
        dto.setAuthors(List.of(author));

        BookService bookService = new BookService();
        bookService.create(dto);
    }
}