package com.study.jung.springboot.service;

import java.util.Optional;

import com.study.jung.springboot.domain.Book;

public interface BookService {
	
	Optional<Book> findById(Long id);
}
