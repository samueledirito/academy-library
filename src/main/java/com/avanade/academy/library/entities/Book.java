package com.avanade.academy.library.entities;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@RequiredArgsConstructor
public class Book {
    @Id
    @GeneratedValue
    private Long id;

    private String title;
}
