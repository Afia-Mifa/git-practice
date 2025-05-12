package org.example.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
public class Book {

    private long id;

    private String name;

    private List<Author> authors;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + authors.stream()
                .map(a -> a.getFirstName() + " " + a.getLastName())
                .collect(Collectors.joining()) +
                '}';
    }
}
