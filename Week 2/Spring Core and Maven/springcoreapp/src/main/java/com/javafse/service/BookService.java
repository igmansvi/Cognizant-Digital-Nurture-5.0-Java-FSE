package com.javafse.service;

import com.javafse.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    /*
        -- Constructor (Dependency Injection through constructor)
        public BookService(BookRepository bookRepository) {
            this.bookRepository = bookRepository;
        }
    */

    /*
        -- Setter (Dependency Injection through setter function)
    */
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String bookName) {
        System.out.println("Processing: " + bookName);
        bookRepository.saveBook(bookName);
    }
}