package com.pro.book.controllers;

import com.pro.book.models.Book;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

  @GetMapping("/books")
  public List<Book> getBooks() {
    List<Book> books = new ArrayList<>();
    books.add(new Book("b10", 10L));
    books.add(new Book("b11", 10L));
    return books;
  }

  @GetMapping("/books/{bookName}")
  public Book getBooks(@PathVariable("bookName") final String bookName) {
    return new Book(bookName, 100L);
  }
}
