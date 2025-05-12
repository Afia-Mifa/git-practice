package org.example;

import lombok.RequiredArgsConstructor;
import org.example.entity.Author;
import org.example.entity.Book;
import org.example.entity.Library;
import org.example.entity.Price;
import org.example.model.BookDto;
import org.example.model.LibraryRepository;
import org.example.service.BookService;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        BookService bookService = new BookService();

        BookDto dto1 = BookDto.getBook1();
        BookDto dto2 = BookDto.getBook2();
        BookDto dto3 = BookDto.getBook3();

        Book book1 = bookService.create(dto1);
        Book book2 = bookService.create(dto2);
        Book book3 = bookService.create(dto3);

        Library library = bookService.createLibrary("Central City Library");

        bookService.addBooksToLibrary(library, book1);
        bookService.addBooksToLibrary(library, book2);
        bookService.addBooksToLibrary(library, book3);

        library.printLibraryDetails();

    }
}