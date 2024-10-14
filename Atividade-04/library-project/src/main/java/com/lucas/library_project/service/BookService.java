package com.lucas.library_project.service;

import com.lucas.library_project.model.Book;
import com.lucas.library_project.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(String title) {
        bookRepository.deleteById(findBookByTitle(title).getId());
    }

    public Book updateBookYear(String title, int year) {
        Book book = findBookByTitle(title);
        book.setYear(year);
        return bookRepository.save(book);
    }

    public List<Book> findBooksByAuthor(String author) {
        return bookRepository.findByAuthor(author);
    }

    public List<Book> findBooksPublishedAfterYear(int year) {
        return bookRepository.findByYearGreaterThan(year);
    }

    private Book findBookByTitle(String title) {
        return bookRepository.findAll().stream()
                .filter(book -> book.getTitle().equals(title))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Livro não encontrado: " + title));
    }

    public void deleteBookById(String id) {
        bookRepository.deleteById(id);
    }

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

}
