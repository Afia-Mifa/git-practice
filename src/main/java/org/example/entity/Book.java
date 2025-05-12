package org.example.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
public class Book {

    private long id;

    private String name;

    private String isbn;

    private List<Author> authors;

    private Price price;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", isbn='" + isbn + '\'' +
                ", price='" + String.format("%.2f", Objects.nonNull(price) ? price.getPrice().doubleValue() : null) + '\'' +
                ", authors=" + authors.stream()
                .map(a -> a.getFirstName() + " " + a.getLastName())
                .collect(Collectors.joining()) +
                '}';
    }
}
