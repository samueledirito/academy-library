package com.avanade.academy.library.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Book {
    @Id
    @GeneratedValue
    private Long id;

    private String title;
}
