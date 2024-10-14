package com.lucas.library_project.repository;

import com.lucas.library_project.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BookRepository extends MongoRepository<Book, String> {

    List<Book> findByAuthor(String author);
    List<Book> findByYearGreaterThan(int year);
}