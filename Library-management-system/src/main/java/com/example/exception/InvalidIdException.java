package com.example.exception;

public class InvalidIdException extends RuntimeException{

	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Invalid Id";
	}
	
}
