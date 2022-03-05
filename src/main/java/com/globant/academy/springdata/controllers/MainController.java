package com.globant.academy.springdata.controllers;

import com.globant.academy.springdata.entities.Author;
import com.globant.academy.springdata.entities.Book;
import com.globant.academy.springdata.repositories.AuthorRepository;
import com.globant.academy.springdata.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path="/api/v1")
public class MainController {
    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookRepository bookRepository;

    @PostMapping(path="authors")
    public @ResponseBody String addNewAuthor(@RequestBody Author autor){
        Author saved = authorRepository.save(autor);
        autor.getBooks().stream().forEach(bookRepository::save);
        return saved.toString();
    }

    @PostMapping(path="books")
    public @ResponseBody String addNewBook(@RequestBody Book book){
        Book saved = bookRepository.save(book);
        return saved.toString();
    }


}
