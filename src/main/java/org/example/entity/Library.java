package org.example.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Library {

    private long id;

    private String name;

    private List<Book> books = new ArrayList<>();

    public void addBooks(Book book) {
        this.getBooks().add(book);
    }

    public void printLibraryDetails() {
        System.out.println("\nLibrary: " + this.getName());
        System.out.println("Books in Library:");
        for (Book b : this.getBooks()) {
            System.out.println("- " + b.getName() + " by " + b.getAuthorNames());
        }
    }
}
