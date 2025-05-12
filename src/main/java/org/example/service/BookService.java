package org.example.service;

import org.example.entity.Book;
import org.example.entity.Library;
import org.example.model.BookDto;

public class BookService {

    public Book create(BookDto dto) {
        Book book = new Book();
        book.setName(dto.getName());
        book.setIsbn(dto.getIsbn());
        book.setAuthors(dto.getAuthors());
        book.setPrice(dto.getPrice());
        System.out.print("\nCreated book successfully....\n");
        System.out.print("Book Name: " + book.getName() + "\n");
        System.out.print("Book Author: " + book.getAuthorNames() + "\n");
        System.out.print("Book Price: " + book.getPrice() + "\n");
        return book;
    }

    public Library createLibrary(String name) {
        Library library = new Library();
        library.setName(name);
        System.out.print("\nSuccessfully created a library....\n");
        return library;
    }

    public void addBooksToLibrary(Library library, Book book) {
        library.addBooks(book);
    }
}
