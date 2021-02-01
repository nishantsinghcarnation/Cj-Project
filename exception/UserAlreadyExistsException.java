package com.cts.cj.exception;

import com.cts.cj.exception.CJException;

public class UserAlreadyExistsException extends CJException {

	private static final long serialVersionUID = 1L;
		
	private String message;

	public UserAlreadyExistsException(String string) {
		this.setMessage(string);
	}


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
