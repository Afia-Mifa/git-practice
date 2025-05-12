package org.example.service;

import org.example.entity.Book;
import org.example.model.BookDto;

public class BookService {

    public void create(BookDto dto) {
        Book book = new Book();
        book.setName(dto.getName());
        book.setIsbn(dto.getIsbn());
        book.setAuthors(dto.getAuthors());
        System.out.print("Created book successfully....\n" + book);
    }
}
