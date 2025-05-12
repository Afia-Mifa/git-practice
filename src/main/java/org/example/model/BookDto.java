package org.example.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.entity.Author;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class BookDto {

    private int id;

    private String name;

    private List<Author> authors;
}
