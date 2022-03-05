package com.globant.academy.springdata.repositories;

import com.globant.academy.springdata.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Integer> {

}
