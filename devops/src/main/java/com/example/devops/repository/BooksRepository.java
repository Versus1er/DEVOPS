package com.example.devops.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.devops.entities.Book;

@Repository
public interface BooksRepository extends CrudRepository<Book, Long> {

}
