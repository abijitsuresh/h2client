package com.abijit.h2client.repository;

import com.abijit.h2client.model.Book;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Flux;

public interface BooksRepository extends R2dbcRepository<Book, Integer> {
    Flux<Book> findAllByTitleContainingIgnoreCase(String title);
}
