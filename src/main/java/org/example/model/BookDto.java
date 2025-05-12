package org.example.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.entity.Author;
import org.example.entity.Price;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class BookDto {

    private int id;

    private String name;

    private String isbn;

    private Price price;

    private List<Author> authors;
}
