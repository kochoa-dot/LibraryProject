package com.example.Biblioteca.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Books")
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private int Id;

    @Getter @Setter
    private String Title;

    public Books(){}
}
