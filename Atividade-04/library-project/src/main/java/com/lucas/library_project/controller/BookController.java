package com.lucas.library_project.controller;

import com.lucas.library_project.model.Book;
import com.lucas.library_project.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @DeleteMapping("/{title}")
    public void deleteBook(@PathVariable String title) {
        bookService.deleteBook(title);
    }

    @PutMapping("/{title}")
    public Book updateBookYear(@PathVariable String title, @RequestParam int year) {
        return bookService.updateBookYear(title, year);
    }

    @GetMapping("/author/{author}")
    public List<Book> findBooksByAuthor(@PathVariable String author) {
        return bookService.findBooksByAuthor(author);
    }

    @GetMapping("/year/{year}")
    public List<Book> findBooksPublishedAfterYear(@PathVariable int year) {
        return bookService.findBooksPublishedAfterYear(year);
    }

    @DeleteMapping("/id/{id}")
    public void deleteBookById(@PathVariable String id) {
        bookService.deleteBookById(id);
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.findAllBooks();
    }

}
