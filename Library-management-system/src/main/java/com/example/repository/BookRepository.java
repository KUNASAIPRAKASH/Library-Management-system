package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {

	//List<Book> findByB_name(String b_name);
	
}
