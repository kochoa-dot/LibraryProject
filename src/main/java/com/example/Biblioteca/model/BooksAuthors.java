package com.example.Biblioteca.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class BooksAuthors {
    @Id
    @Getter
    @Setter
    private Long AuthorId;

    @Getter
    @Setter
    private Long BookId;
}
