package org.example.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Author {

    private long id;

    private String firstName;

    private String lastName;

    private int age;
}
