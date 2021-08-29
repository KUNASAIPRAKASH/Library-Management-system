package com.example.service;

import com.example.exception.InvalidIdException;

public interface BookService {


	void addBook(String b_id, String b_name,String Author) throws InvalidIdException;
	
	
}
