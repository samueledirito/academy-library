package com.avanade.academy.library.repositories;

import com.avanade.academy.library.entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
