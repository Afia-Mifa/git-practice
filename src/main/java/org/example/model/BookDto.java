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

    public static BookDto getBook1() {
        BookDto dto = new BookDto();
        dto.setName("The Whispering Shadows");
        dto.setIsbn("9781234567001");

        Author author1 = new Author();
        author1.setFirstName("Elena");
        author1.setLastName("Harper");
        dto.setAuthors(List.of(author1));

        Price price1 = new Price();
        price1.setPrice(BigDecimal.valueOf(850.00));
        price1.setVat(BigDecimal.valueOf(127.50));
        price1.setDiscount(50L);
        dto.setPrice(price1);
        return dto;
    }

    public static BookDto getBook2() {
        BookDto dto = new BookDto();
        dto.setName("Harry Potter and the Sorcerer's Stone");
        dto.setIsbn("978-0439708180");

        Author author = new Author();
        author.setFirstName("J.K.");
        author.setLastName("Rowling");
        dto.setAuthors(List.of(author));

        Price price = new Price();
        price.setPrice(BigDecimal.valueOf(100.00));
        price.setVat(BigDecimal.valueOf(5.00));
        price.setDiscount(2L);
        dto.setPrice(price);
        return dto;
    }

    public static BookDto getBook3() {
        BookDto dto = new BookDto();
        dto.setName("Code of the Ancients");
        dto.setIsbn("9781234567002");

        Author author2 = new Author();
        author2.setFirstName("Lila");
        author2.setLastName("Singh");
        dto.setAuthors(List.of(author2));

        Price price2 = new Price();
        price2.setPrice(BigDecimal.valueOf(1100.00));
        price2.setVat(BigDecimal.valueOf(165.00));
        price2.setDiscount(100L);
        dto.setPrice(price2);
        return dto;
    }
}
