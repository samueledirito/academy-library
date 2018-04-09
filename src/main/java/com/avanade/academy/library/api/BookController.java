package com.avanade.academy.library.api;

import com.avanade.academy.library.api.forms.BookForm;
import com.avanade.academy.library.entities.Book;
import com.avanade.academy.library.repositories.BookRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RequestMapping("/api/books")
public class BookController {
    private final BookRepository repository;

    @Value
    public class BookItem {
        private final String title;
    }

    @GetMapping
    public BookItem test() {
        return new BookItem("Il Titolo");
    }

    @PostMapping
    public void createNewBook(@RequestBody BookForm bookForm) {
        if (!bookForm.isAGoodBook())
            bookForm.setTitle(bookForm.getTitle().toLowerCase());
        Book book = new Book();
        book.setTitle(bookForm.getTitle());
        this.repository.save(book);
    }
}
