package com.globant.academy.springdata.repositories;

import com.globant.academy.springdata.entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
